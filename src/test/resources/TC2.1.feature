@run
Feature: TC2.1

  Scenario: TC 2.1 [Chrome] Log in proccess using e-mail address
    * Generic: Open Page https://www.etsy.com/
    * Etsy Homepage: Click button Zaloguj się
    * Etsy Login Component: Login with email: testatestowa002@gmail.com, Password: Test1234567
    * Etsy Homepage: Verify correct login / registration

