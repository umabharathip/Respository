package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver; 
	}
	
	 
	 public void homePageValidation()
	 {
		 WebElement corporate=driver.findElement(By.linkText("Corporate"));
		 WebElement business=driver.findElement(By.linkText("Business"));
		 WebElement international=driver.findElement(By.linkText("International"));
		 WebElement pri_banking=driver.findElement(By.linkText("Private Banking"));
		 WebElement al_islami=driver.findElement(By.linkText("Al Islami"));
		 WebElement gold=driver.findElement(By.linkText("Gold"));
		 WebElement security=driver.findElement(By.linkText("Mashreq Securities"));
		 WebElement capital=driver.findElement(By.linkText("Mashreq Capital"));
		 WebElement global=driver.findElement(By.linkText("Mashreq Global Services"));
		 
		 if (corporate.isDisplayed()==true)
		 {
		 String actualTitle =corporate.getText();
		 String expectedTitle ="Corporate";
		 Assert.assertEquals(actualTitle,expectedTitle);
		 System.out.println(actualTitle);
	 }
		 if (business.isDisplayed()==true)
		 {
		 String actualTitle =business.getText();
		 String expectedTitle ="Business";
		 Assert.assertEquals(actualTitle,expectedTitle);
		 System.out.println(actualTitle);
	 }
		 if (international.isDisplayed()==true)
		 {
		 String actualTitle =international.getText();
		 String expectedTitle ="International";
		 Assert.assertEquals(actualTitle,expectedTitle);
		 System.out.println(actualTitle);
	 }
		 if (pri_banking.isDisplayed()==true)
		 {
		 String actualTitle =pri_banking.getText();
		 String expectedTitle ="Private Banking";
		 Assert.assertEquals(actualTitle,expectedTitle);
		 System.out.println(actualTitle);
	 }
		 if (al_islami.isDisplayed()==true)
		 {
		 String actualTitle =al_islami.getText();
		 String expectedTitle ="Al Islami";
		 Assert.assertEquals(actualTitle,expectedTitle);
		 System.out.println(actualTitle);
	 }
		 if (gold.isDisplayed()==true)
		 {
		 String actualTitle =gold.getText();
		 String expectedTitle ="Gold";
		 Assert.assertEquals(actualTitle,expectedTitle);
		 System.out.println(actualTitle);
	 }
		 if (security.isDisplayed()==true)
		 {
		 String actualTitle =security.getText();
		 String expectedTitle ="Mashreq Securities";
		 Assert.assertEquals(actualTitle,expectedTitle);
		 System.out.println(actualTitle);
	 }
		 if (capital.isDisplayed()==true)
		 {
		 String actualTitle =capital.getText();
		 String expectedTitle ="Mashreq Capital";
		 Assert.assertEquals(actualTitle,expectedTitle);
		 System.out.println(actualTitle);
	 }
		 if (global.isDisplayed()==true)
		 {
		 String actualTitle =global.getText();
		 String expectedTitle ="Mashreq Global Services";
		 Assert.assertEquals(actualTitle,expectedTitle);
		 System.out.println(actualTitle);
	 }
	 }
	 
	 public void newsDisplay()
	 {
		WebElement news=driver.findElement(By.className("newsBox")) ;
		String text =news.getText();
		if(text.contains("Mashreq News"))
		{
		System.out.println("Mashreq News Displayed on Home Page");
		}
		}
	 public void contactUsPage()
	 {
		 WebElement contact=driver.findElement(By.cssSelector("[title=\"Contact us\"]"));
		 if (contact.isDisplayed()==true)
		 {
		 String actualTitle =contact.getText();
		 String expectedTitle ="CONTACT";
		 Assert.assertEquals(actualTitle,expectedTitle);
		 System.out.println("Contact Us link displayed");
		 
		 contact.click();
		 //Thread.sleep(3000);
		 WebElement form=driver.findElement(By.name("form")) ;
		 //WebElement element = driver.findElement(By.id("myElement"));
		 //contact.click();
		 boolean form_disp=form.isDisplayed();
		 if (form_disp==true)
		 {
		 System.out.println("Contact form Page Loaded");
		 }
		 }
	 
	 }
	 
	 }
  
   