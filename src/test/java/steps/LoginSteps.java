package steps;

import net.thucydides.core.steps.ScenarioSteps;
import pages.LoginPage;

/**
 * Created by Ardit Podrimaj
 */

public class LoginSteps extends ScenarioSteps {

    LoginPage loginPage;


    public void login(String email, String password) {
        loginPage.getEmailInput().type(email);
        loginPage.getPasswordInput().type(password);
        loginPage.getLoginButton().click();
    }
}