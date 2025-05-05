Feature: Calculator

  Scenario: Add two numbers
    Given I have a calculator
    When I add 2.0 and 3.0
    Then the result should be 5.0

  Scenario: Subtract two numbers
    Given I have a calculator
    When I subtract 3.0 from 4.0
    Then the result should be 1.0

  Scenario: Multiply two numbers
    Given I have a calculator
    When I multiply 4.0 and 3.0
    Then the result should be 12.0

  Scenario: Divide two numbers
    Given I have a calculator
    When I divide 4.0 by 2.0
    Then the result should be 2.0

  Scenario: Divide by zero
    Given I have a calculator
    When I divide 1.0 by 0.0
    Then an error should be thrown
