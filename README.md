Prerequisite :
Selenium WebDriver
TestNg
Maven
Java 1.8
Eclipse photon

Fuctionalities covered:
This test will be based on the public Mashreq website . This tests should test the following acceptance criteria,
On the homepage:
-	The navigation bar should be visible on desktop devices and display 9 items: Corporate, Business, International etc.
-	The Mashreq News should be displayed on the homepage
-	A link for “Contact Us” should be displayed on the homepage. Clicking this link should take you to the contact form page
On the contact form page:
-	Submitting the form without entering any details should indicate an error and specify which fields are required
-	The “I am looking to…” field is a dropdown with 4 choices
-	The “Select Sub Product” field is initially empty
-	Selecting the Product “Loans” from the dropdown populates the “Select Sub Product” dropdown with 6 options including “Home Loan UAE Resident”
-	Entering a number that is less than 7 digits in the “Mobile Number” field should show an error. Entering a number that is 7 digits should not show an error

To Run test:

Follow Setup instrustion for create,run and generate TestNG framework:
https://docs.mendix.com/howto/testing/create-automated-tests-with-testng

Run As TentNG Test from /com.mashreq.selenium.java/src/test/java/test/MashreqTest.java
