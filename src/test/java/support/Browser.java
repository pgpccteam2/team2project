package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Browser {

	public static String browser;
	public static String systemOSName;
	public static DesiredCapabilities desiredCap;
	public static String runType;

	public Browser(){
		browser = System.getProperty("browser");
		systemOSName = System.getProperty("os.name");
		desiredCap = DesiredCapabilities.chrome();
		runType="CLOUD";
		runType="local";
		browser="chrome";
	}

	public static WebDriver launch() {
		desiredCap = DesiredCapabilities.chrome();
		//runType="CLOUD";
		runType="local";
		browser="chrome";

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--test-type");
		options.addArguments("--disable-extensions");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-setuid-sandbox");
		options.addArguments("--start-maximized");

		if (runType.equalsIgnoreCase("CLOUD")){
			options.addArguments("--headless");
			//options.addArguments("--start-maximized");
			options.addArguments("--window-size=1920,1080");
			options.addArguments("--disable-gpu");
			options.addArguments("--proxy-server='direct://'");
			options.addArguments("--proxy-bypass-list=*");
			options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			options.setAcceptInsecureCerts(true);
		}

		desiredCap.setCapability(ChromeOptions.CAPABILITY, options);

		String systemOSName = System.getProperty("os.name");

		if(systemOSName.contains("Windows") || systemOSName.contains("windows")) {
			System.setProperty("webdriver.chrome.driver", "C:/Windows/System32/chromedriver.exe");
			desiredCap.setCapability("chrome.binary", "C:/Windows/System32/chromedriver.exe");
		}
		else if(systemOSName.contains("Ubuntu") || systemOSName.contains("ubuntu")) {
			//if OS is ubuntu
			System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
			desiredCap.setCapability("chrome.binary", "/opt/google/chrome/google-chrome");
		}

		if(browser.equals("firefox")) {
			return new FirefoxDriver();
		} else if(browser.equals("chrome")) {
			return new ChromeDriver(options);
		} else if(browser.equals("msie")) {
			return new InternetExplorerDriver();
		} else {
			throw new RuntimeException("Unrecognized system property 'browser': " + browser);
		}
	}
}
