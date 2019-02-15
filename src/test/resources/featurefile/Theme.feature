#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: 1
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Verify the Theme functionality is working as expected
  I want to use this template for my feature file

  @tag1
  Scenario: Change the Sudoku app theme from white to dark
    Given I have install and aunch sudoku app on android device
    When I tap on theme icon
    Then Theme option should be open 
    And I change the current theme to dark