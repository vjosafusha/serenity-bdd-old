package definitions;

import cucumber.api.java.Before;
import net.serenitybdd.core.Serenity;

/**
 * Created by Ardit Podrimaj
 */

public class Hooks {


    @Before
    public void init() {

        Serenity.getWebdriverManager().getWebdriver().get("https://www.facebook.com/");
        Serenity.getWebdriverManager().getWebdriver().manage().window().maximize();
    }
}