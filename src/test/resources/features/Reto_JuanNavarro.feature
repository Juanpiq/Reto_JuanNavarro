#Autor: Juan Navarro
  # language: en

@stories
  Feature: Sign Up Automation
    As a user, I want to create a Sign Up automation process at Utest web page.

  @scenario1
  Scenario: Sign Up in Utest.com
    Given than Juan wants to Sign Up at Utest.com
    When he insert his Personal Data
    |strFirstName|strLastName|strEmail|
    |Juan        |Navarro    |juanavarroquintero@gmail.com|
    And he insert his Address
    |strZip|
    |0000   |
    And he insert his Devices Information
    And he insert a Password
    |strPassword|
    |Choucair_Password#123|
    Then he can create a New Account
    |strTitleText|
    |Welcome to the world's largest community of freelance software testers!|
