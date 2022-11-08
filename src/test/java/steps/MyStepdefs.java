package steps;

import api.cucumber.Page.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MyStepdefs {
    WebDriver driver=null;
    LoginPage login;
    @Given("^Browser is open$")
    public void browserIsOpen() {
        System.out.println("inside browser is open");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
      // driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
       // driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        System.out.println("browser us open");

    }

    @And("^User is on login Page$")
    public void userIsOnLoginPage() {
        driver.navigate().to("https://example.testproject.io/web/");
        System.out.println("helooo");
    }


    @When("^User click on Login$")
    public void userClickOnLogin() {
        login.clickLogin();
    }

    @Then("^User is navigate to home page$")
    public void userIsNavigateToHomePage() throws InterruptedException {
        Assert.assertTrue(login.checkLogOutidsDisplayed());
        Thread.sleep(3000);
        driver.close();
    }

    @When("^User enters (.+) and (.+)$")
    public void user_enters_and(String username, String password) throws Throwable {
       // throw new PendingException();
        login=new LoginPage(driver);
        login.enterUsername(username);
        login.enterPassword(password);
        Thread.sleep(4000);
    }





   /* @When("^User enters <username> and <password>$")
    public void userEntersUsernameAndPassword(String username,String password) throws InterruptedException {
        login=new LoginPage(driver);
        login.enterUsername(username);
        login.enterPassword(password);
        Thread.sleep(2000);
    }*/
  /*  @When("^User enters Deepti and (\\d+)$")
    public void user_enters_Deepti_and(String username,String password) throws Throwable {
        login=new LoginPage(driver);
        login.enterUsername(username);
        login.enterPassword(password);
        Thread.sleep(2000);
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^User enters Anjali and (\\d+)$")
    public void user_enters_Anjali_and(String username,String password) throws Throwable {
        login=new LoginPage(driver);
        login.enterUsername(username);
        login.enterPassword(password);
        Thread.sleep(2000);
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }*/



}
