package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ebaySearch {
	
	public static WebDriver driver;


	@Given("^I am on ebay homepage$")
	public void givenStat() throws Throwable	{
		
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("http:ebay.com.au");


		
	}
	
	@When("^I search for ([^\"]*)$")
	public void whenStat(String str) throws Throwable {

		driver.findElement(By.id("gh-ac")).sendKeys("Lenovo");
		driver.findElement(By.id("gh-btn")).click();


	}
	
	@Then("^Search ([^\"]*)$")
	public void thenDo(String str)throws Throwable{
		System.out.println(driver.findElement(By.xpath(".//span[@class='listingscnt']")));

	}
}
