Feature: Products Information
  Verify if user is able to navigate to products page and view information about individual products

  Scenario: User is able to view products and their information
    Given user visits https://aspiration.com/
    When user clicks on Spend & Save
    Then user navigates to Products page
    And user clicks on Get Aspiration
    And user clicks on Close
    And user clicks on Get Aspiration Plus
    Then plans should be displayed
