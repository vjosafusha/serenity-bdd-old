package pages;

import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * Created by Ardit Podrimaj
 */

@Getter
public class LoginPage extends PageObject {

    @FindBy(id = "email")
    WebElementFacade emailInput;

    @FindBy(id = "pass")
    WebElementFacade passwordInput;

    @FindBy(css = "[value=\"Log In\"]")
    WebElementFacade loginButton;
}