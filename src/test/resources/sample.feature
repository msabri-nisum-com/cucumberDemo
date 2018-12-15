Feature: Sample Cuke

  @wip
  Scenario Outline: Validate Product Service API from browser
    Given products get API is called via <browser>
    When the API is invoked from browser
    Then there should be valid response
    Examples:
      |browser|
      | chrome|
      | safari |

  @rest
  Scenario: Validate Product Service API using REST Assured
    Given a REST Endpoint is available
    When the rest endpoint is called
    Then expected response is obtained

  Scenario Outline:Sum of integers is tested
    Given two numbers <one> and <two> are provided
    When the operand <operation> is passed
    Then  expected result of <result> is obtained

    Examples:
      | one | two | operation | result |
      |  10   |20 | add       | 30     |
      |  20   |10 | subract   | 10     |
      |  4   |5 | multiply   | 20     |
