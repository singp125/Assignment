# Assignment
UI and API automation test

I have created automation tests for both UI and APIs for below scenarios:

# UI Test Scenarios:

# Registration page:
1. Verify user can successfully register to Book Store by entering special characters in name fields(e.g., O'Brien, Mary-Jane)
   @Test Method - registrationWithSpecialCharacters()
2. Verify user cannot register to Book Store with already taken username.
   @Test Method - failedregistrationWithAlreadyRegisteredUser()

# Login Page:
1. Verify user is able to login successfully to Book Store with correct username and password.
   @Test Method - successfullLoginWithValidCredentials()
2. Verify user is not able to login successfully to Book Store with incorrect login credentials.
   @Test Method - unsuccessfullLoginWithInvalidCredentials()

# Search page:
1. User can search for a book using keywords related to the book's content and verify search results are relevant and accurate.
   @Test Method - searchForBookUsingKeywords()
2. User can search for a book with special characters in the title, author, Publisher (e.g., O'Reilly, Dumas', C. Zakas)and verify search results are relevant and accurate.
   @Test Method - searchForBookUsingSpecialCharacters()

# API Test Scenarios:

# POST Request:
1. To verify that a user can be successfully created with valid data.
   @Test Method - validUserCreation()
2. To verify that the API returns an error when required fields are missing during creation of user.
   @Test Method - missingRequiredFields()

# GET Requests:
1. To verify that the list of users can be successfully retrieved.
   @Test Method - retrieveAllUsers()
2. To verify that a specific user can be retrieved by their ID.
   @Test Method - retrieveSpecificUser()

# Framework used:
1. IDE: Eclipse
2. Testing Framework: TestNG + Selenium Webdriver (For UI Automation) + RestAssured (For API Automation)
3. Language: Java
4. Build Management: Maven
5. Version Control: Git Hub

# How To run Above test from Scratch:
1. Install Java in your system and set Java Home Path in system variables in your system (steps to setup the java home path varies slightly in Windows and Mac).
2. For Installing Java, Go to : https://www.oracle.com/java/technologies/downloads/ and download latest JDK version(you can download either for windows or for mac)
3. Set Java Home path in your system variables - for Windows system,

   * Go to C drive -> program files - > Java
   * Open the JDK version you just installed 
   * Select this one and this is the home path of your Java, So copy this home path of the JDK 
   * From your search box, go to edit system environment variables 
   * Select new button and add Java home here, and then paste that value path where the Java home is placed 
   * Click Okay 
   * Go back to your system variables 
   * Select Path and add new by pasting the path 
   * Click Okay
   
4. If you are not on Windows and using macOS, then Set Java Home path in your system variables - for macOS system,
  
   * Open Terminal and enter command - /usr/libexec/java_home -v, this will display the java version installed in your system, copy that path
   * enter command - vi ~/.zshrc
   * This file will now open in edit mode
   * for editing a file in command line prompt press 'I' and then add "export JAVA_HOME=$(/Library/Java/JavaVirtualMachines/jdk-21.jdk/Contents/Home)" line of code, in your case you need to replace the path from one you copied at first step
   * Hit Esc and then :wq and then Enter
   * Enter command - source ~/.zshrc
   * Enter command - echo $JAVA_HOME , this now show that you have set your java home environment variable
  
5. Download Eclipse - Go to : https://www.eclipse.org/downloads/ and select 'Download Pacakages' hyperlink -https://www.eclipse.org/downloads/packages/, and then install 'Eclipse IDE for Enterprise Java and Web Developers' either for windows or for macOS
6. 





















