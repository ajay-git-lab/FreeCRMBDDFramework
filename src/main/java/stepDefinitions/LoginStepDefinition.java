/*
 * package stepDefinitions;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.JavascriptExecutor;
 * import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement;
 * import org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import cucumber.api.java.en.Given; import cucumber.api.java.en.Then; import
 * cucumber.api.java.en.When; import junit.framework.Assert;
 * 
 * public class LoginStepDefinition {
 * 
 * WebDriver driver;
 * 
 * @Given("^User is already on login page$") public void
 * user_already_on_login_page() { System.setProperty("webdriver.chrome.driver",
 * "C:\\Personal Documents\\Ajay\\AjayEclipseWS\\ChromeDriver\\chromedriver.exe"
 * ); driver = new ChromeDriver(); driver.get("https://www.crmpro.com/"); }
 * 
 * @When("^Title of login page is Free CRM$") public void
 * tite_of_login_page_is_Free_CRM() { String title = driver.getTitle();
 * System.out.println(title); Assert.
 * assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support."
 * , title); }
 * 
 * @Then("^user enters \"(.*)\" and \"(.*)\"$") // Regular expression: 1.
 * \"([^\"]*)\"   2. \"(.*)\" public void
 * user_enters_username_and_password(String username, String password) {
 * driver.findElement(By.name("username")).sendKeys(username);
 * driver.findElement(By.name("password")).sendKeys(password); }
 * 
 * @Then("^user clicks on login button$") public void
 * user_clicks_on_login_button(){ WebElement loginBtn =
 * driver.findElement(By.xpath("//input[@type='submit']")); JavascriptExecutor
 * js = (JavascriptExecutor) driver; js.executeScript("arguments[0].click();",
 * loginBtn); }
 * 
 * @Then("^user is on home page$") public void user_is_on_home_page() { String
 * title = driver.getTitle(); System.out.println("Hope Page Title is: "+title);
 * Assert.assertEquals("CRMPRO", title); }
 * 
 * 
 * 
 * 
 * }
 */