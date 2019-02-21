package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinitions {
	WebDriver driver;
	//sravya
@Given("^user is already on Login Page$")
public void user_is_already_on_Login_page() {
	System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://www.crmpro.com/index.html");
}

@When("^title of login page is Free CRM$")
public void title_of_login_page_is_Free_CRM()  {
 String title=driver.getTitle();
 System.out.println(title);
 //Assert.assertEquals("CRMPRO  - CRM software for customer relationship management, sales, and support.",title);
}


 @When("^user enters username and password$")
public void user_enters_username_and_password() {
	driver.findElement(By.name("username")).sendKeys("sravya246");
	driver.findElement(By.name("password")).sendKeys("Sravya@123");    
}

@Then("^user clicks on login button$")
public void user_clicks_on_login_button()  {
	//driver.findElement(By.xpath("//input[@type='submit']")).click();
	WebElement loginBtn =	driver.findElement(By.xpath("//input[@type='submit']"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("arguments[0].click();", loginBtn);
   
}

@Then("^user is on home page$")
public void user_is_on_home_page()  {
    String title=driver.getTitle();
    System.out.println(title);
    //Assert.assertEquals("CRMPRO", title);
}

}
