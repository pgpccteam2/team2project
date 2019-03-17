Feature: Capstone project Test Cases scm polling 1
  

  @capstone1
  Scenario: Visit shopping web application and check the page title
    Given I am on web app home page
    Then I verify the title label as "Shopizer"



  @capstone2
  Scenario: Visit shopping web application and check the shopping cart is displayed
    Given I am on web app home page
    Then I verify the option "Shopping cart" is displayed

