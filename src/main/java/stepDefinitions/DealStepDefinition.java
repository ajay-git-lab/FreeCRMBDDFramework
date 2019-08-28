package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class DealStepDefinition {
WebDriver driver;

@Given("^user is already on Login page$") 
public void user_already_on_login_page() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Personal Documents\\Ajay\\AjayEclipseWS\\ChromeDriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.crmpro.com/");
}

@When("^title of login page is Free CRM$")
public void tite_of_login_page_is_Free_CRM() {
	  String title = driver.getTitle();
	  System.out.println(title);
	  Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
}

@Then("^user enters username and password$") // Regular expression: 1. \"([^\"]*)\"   2. \"(.*)\"
public void user_enters_username_and_password(DataTable credentials) {
	List<List<String>> data = credentials.raw();
  driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
  driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
}

@Then("^user clicks on login button$")
public void user_clicks_on_login_button(){
	WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", loginBtn);
}

@Then("^user is on home page$")
public void user_is_on_home_page() { 
	 String title = driver.getTitle();
	 System.out.println("Hope Page Title is: "+title);
	 Assert.assertEquals("CRMPRO", title);
}

@Then ("^user moves to new deal page$")
public void user_moves_to_new_deal_page() {
	driver.switchTo().frame("mainpanel");
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
	driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();	
}

@Then ("^user enters deal details and save$")
public void user_enters_deal_details(DataTable credentials) {
	List<List<String>> data = credentials.raw();
	driver.findElement(By.id("title")).sendKeys(data.get(0).get(0));
	driver.findElement(By.id("amount")).sendKeys(data.get(0).get(1));
	driver.findElement(By.id("probability")).sendKeys(data.get(0).get(2));
	driver.findElement(By.id("commission")).sendKeys(data.get(0).get(3));
	driver.findElement(By.xpath("//input[@type='submit']")).click();;
}







}
