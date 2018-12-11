Feature: Sample Cuke

  Scenario: My Sample Test
    Given there is a precondition
    When  action is performed
    Then  there is result

  Scenario: Retrieve International Space Station Current Location
    Given I access the ISS Current Location
    When I retrieve the ISS Current Location
    Then I see the ISS Current Location

  Scenario: Open Amazon in browser
    Given I am on the Google search page
    When I search for "Amazon!"
    Then the page title should start with "amazon"