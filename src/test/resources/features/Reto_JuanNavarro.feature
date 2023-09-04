#Autor: Juan Navarro
  # language: en

@stories
  Feature: Sign Up Automation
    As a user, I want to create a Sign Up automation process at Utest web page.

  @scenario1
  Scenario: Sign Up in Utest.com
    Given than Juan wants to Sign Up at Utest.com
    When he insert his Personal Data
    And he insert his Address
    And he insert his Devices Information
    And he insert a Password
    Then he can create a New Account
