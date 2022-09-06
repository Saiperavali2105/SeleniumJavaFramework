#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
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
Feature: verification of login
  I want to use this template for my feature file

  @tag2
  Scenario Outline: verification of login
    Given User is on home screen
    When I enter username "username"
    And I enter password "password"
    #Then I verify the successful login

    Examples: 
      | username  | password | 
      | name1 |    password1 |
      #| name2 |     password2 |
