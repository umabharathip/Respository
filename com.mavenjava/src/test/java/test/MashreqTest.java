package test;

import org.testng.annotations.Test;

import pages.ContactFormPage;
import pages.HomePage;

public class MashreqTest extends BaseTest{	

			
	@Test(priority=1)
	public void homepage() { 
	HomePage home_page = new HomePage(driver);
	home_page.homePageValidation();
	home_page.newsDisplay();
	home_page.contactUsPage();
	}
	@Test(priority=2)
	public void contactpage()
	{
	ContactFormPage contact = new ContactFormPage(driver);
	contact.contactUsPage();
	contact.submitForm();
	contact.iamLookingInto();
	contact.selectSubProduct();
	contact.selectLoanFromProduct();
	contact.mobileNumberValidation("23456");
	contact.mobileNumberValidation("1234567");
	
	 }
			
	}


