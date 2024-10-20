# OrangHRM_AutomationTesting

## Selenium Test Automation Project
This project automates the process of navigating to the OrangeHRM web application, logging in with valid credentials, and performing administrative tasks like creating a new user. The automation scripts are written in Java using the Selenium WebDriver and TestNG framework.

## Prerequisites
Java JDK: Ensure you have JDK-23 installed.

Maven: Used for managing project dependencies.

ChromeDriver: Required for Chrome browser automation.

## Test Scenarios

1. Login with Valid Credentials:

  Description: Verifies that a user can log in with valid credentials.

  Assertions: Confirms the URL changes to the dashboard page upon successful login.

2. Navigate to Admin Menu:

  Description: Validates navigation to the Admin menu after logging in.
  
  Assertions: Checks that the current URL contains "/admin".

3. Create a New User:

  Description: Automates the creation of a new user in the Admin section.
  
  Assertions: Verifies the success message is displayed after user creation.

 4.  Remove created User:

  Description: Automates the removal of the new created user in the Admin section.
  
  Assertions: Verify that the search results do not contain the removed user, confirming successful deletion.

  ##### Created by SMART Team.>>>
