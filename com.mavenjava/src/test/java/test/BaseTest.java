package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	public WebDriver driver ;
	public String url= "https://www.mashreqbank.com/uae/en/personal/home";
	
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\uma\\com.mavenjava\\src\\test\\resources\\chromedriver.exe");	
	    driver = new ChromeDriver();	
	    //Implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get(url);
	}
	@AfterTest	
	public void tearDown() 
	{
	    driver.close();
    }
}
