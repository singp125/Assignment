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

