# Bank Application
*Project 3 from https://www.udemy.com/course/practice-java-by-building-projects course*

Scenario: You are a back-end developer and need to create an application to handle new customer bank account requests.

Your application should do the following:
 * Read a .csv file of names, social security numbers, account type, and initial deposit
 * Use a proper data structure to hold all these accounts
 * Both savings and checking accounts share following properties:
    * deposit()
    * withdraw()
    * transfer()
    * showInfo()

    11-Digit Account Number (generated with the following process: 1 or 2 depending on Savings or Checking, last two digits of SSN, unique 5-digit number, and random 3-digit number)
 * Saving Account holders are given a Safety Deposit Box, identified by a 3-digit number and accessed with a 4-digit code
 * Checking Account holders are assigned a Debit Card with a 12-digit number and 4-digit PIN
 * Both accounts will use an interface that determines the base interest rate.
<br>*Savings accounts will use .25 points less than base rate.*
<br>*Checking accounts will use 15% of the base rate.*
 * The ShowingInfo method should reveal relevant account information as well as information specific to the Checking account of Savings account.
