package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Multiplecondition {
    @Given("^User is at the login page of the application$")
    public void userIsAtTheLoginPageOfTheApplication() {
        System.out.println("userIsAtTheLoginPageOfTheApplication");
    }

    @When("^User logs in with following username and password$")
    public void userLogsInWithFollowingUsernameAndPassword() {
        System.out.println("User logs in with following username and password");
    }

    @Then("^user should be able to login with correct username and password$")
    public void userShouldBeAbleToLoginWithCorrectUsernameAndPassword() {
        System.out.println("user should be able to login with correct username and password");
    }
}
