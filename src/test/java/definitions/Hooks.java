package definitions;

import cucumber.api.java.Before;
import net.serenitybdd.core.Serenity;

/**
 * Created by Ardit Podrimaj
 */

public class Hooks {


    @Before
    public void init() {
    
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vjosa Fusha\\Desktop\\test-cases-ubt\\serenity-bdd-old\\drivers\\geckodriver.exe");
    
        Serenity.getWebdriverManager().getWebdriver().get("https://www.facebook.com/");
        Serenity.getWebdriverManager().getWebdriver().manage().window().maximize();
    }
}