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

  Scenario: Elevating a number to a power
    Given I have a calculator
    When I raise 2 to the power of 3
    Then the result should be 8

  Scenario: Elevation of a number to degree zero
    Given I have a calculator
    When I raise 5 to the power of 0
    Then the result should be 1

  Scenario: The root of a positive number
    Given I have a calculator
    When I take the square root of 9
    Then the result should be 3

  Scenario: Trying to extract the root of a negative number
    Given I have a calculator
    When I take the square root of -4
    Then an exception should be thrown

  Scenario: Absolute value of a negative number
    Given I have a calculator
    When I get the absolute value of -7
    Then the result should be 7