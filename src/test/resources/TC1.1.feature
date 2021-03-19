@run
Feature: TC1.1
  Scenario: [Chrome] Registration process as a new user suing e-mail address without newsletter
    * Generic: Open Page https://www.etsy.com/
    * Etsy Homepage: Click button Zaloguj się
    * Etsy Login Component: Click Register
    * Etsy Login Component: Register with email: tsttestowa@gmail.com, First name: Test, Password: Test1234567, Newsletter: nie
    * Etsy Homepage: Verify correct login / registration

    