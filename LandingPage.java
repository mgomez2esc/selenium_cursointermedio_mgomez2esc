package SeleniumIntermedio.Practico2.AutomaticioPractice.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BasePage {

    public LandingPage(WebDriver remoteDriver){

        this.driver = remoteDriver;
        PageFactory.initElements(driver, this);

    }
    public AuthenticationPage signIn(){

        loginBtn.click();
        AuthenticationPage nextPage = new AuthenticationPage(driver);

        return nextPage;
    }

}