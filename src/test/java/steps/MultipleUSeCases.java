package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleUSeCases {
    private WebDriver driver;
    @Given("^User is on New Page$")
    public void userIsOnNewPage()throws Throwable {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
      //  System.out.println("userIsOnNewPage");
    }

    @When("^User Navigate to Login Page$")
    public void userNavigateToLoginPage() {
        System.out.println("userNavigateToLoginPage");
    }

    @And("^User enters\"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEntersAnd(String username, String password) throws Throwable {
        System.out.println("user name is"+username+ "password id" +password);
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

       // throw new PendingException();
      //  System.out.println("userEntersAnd");
    }

    @Then("^Message displaye Login Succesfully$")
    public void messageDisplayeLoginSuccesfully() throws Throwable {
        System.out.println("succesfuuly login");
        Thread.sleep(2000);
        driver.close();
    }
}
