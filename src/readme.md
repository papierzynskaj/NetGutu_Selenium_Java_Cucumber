 * Introduction
 * General Information
 * Getting Started
 1. Prerequisites
 2. Installation
 * Troubleshooting
 
Introduction
------------
 This projects performs functional test of Login and Registration on Etsy Page. 

 
General Information
------------ 
Project contains two Test Cases.
Test Case 1.1 - [Chrome] Registration process as a new user suing e-mail address without newsletter
This test checks if new user can create new account using e-mail and not signing up for newsletter. 
It includes several assertions such as: is account created, is user transferred to specific section.

Test Case 2.1 - [Chrome] Log in proccess using e-mail address
This test checks if already existing user can sign in via email. 
It includes several assertions such as: is user signed in, is user transferred to specific section.

    
Included Technologies
------------

This code includes technologies such as:
* JDK 
* Cucumber
* IntelliJ IDEA
* Maven
 
 Getting Started
 ------------
  1. Prerequisites
  
    To successfully run test cases you need to have installed:
    * IntelliJ IDEA 2019.3.1
    * JDK 15.0.2
    * Apache Maven 3.6.3
    * Cucumber Plugin in IntelliJ IDEA
    * Chrome Browser 89.0.4389.90
    * Already registered user on Etsy with an email and a password (one exampled is already placed in Test Case 2)
    * Non-existing user with e-mail and a password (one example is already placed in Test Case)
    * GIT
    
  2. Installation
  
    To open this project locally on your IntelliJ:
    * copy the link of GitHub repository
    * create a folder where you would like to store this repository
    * right click on empty space
    * choose GitBash here
    * use: git clone <link to repository>
    * if necessary log in to your GitHub
    * project should appear in folder
    * open IntelliJ IDEA
    * click "File" -> "Open"
    * find copied repository and select the whole folder 
    * click "Open"
    * IntelliJ IDEA should open this project
   
   To run a Test Case
   
   * in folder \\src\\test\\resources there are two Test Cases
   * choose the one you want to run and double click on it
   * you can either right click and choose "Run..." or click green play button located in the top right corner
 
 


