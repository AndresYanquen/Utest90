
@stories
Feature: Sing up in the website Utest
  As a Tester, I want to sign up in the website Utest
  @scenario1
  Scenario: Sign up in the website uTest
    Given than Andres wants to sign up in the website Utest
    When he complete the form in the website
    | firstname | lastname | email                      | month | day | year  | city     | zip    | country | password      |
    | Andres    | Yanquen  | andres.yanquen@hotmail.com | June  | 23  | 1996  | Medellin | 050032 | Colombia| Choucair2021* |
    Then he finds the text
      |message|
      |The last step|
