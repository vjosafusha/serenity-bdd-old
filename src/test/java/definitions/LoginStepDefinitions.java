package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.LoginSteps;

/**
 * Created by Ardit Podrimaj
 */

public class LoginStepDefinitions {

    @Steps
    LoginSteps loginSteps;

    @Given("^user is logged in$")
    public void userIsLoggedIn() {
        loginSteps.login("email", "password");

    }

    @Then("^user should see homepage$")
    public void userShouldSeeHomepage() {

    }
}