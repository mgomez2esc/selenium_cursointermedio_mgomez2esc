package SeleniumIntermedio.Practico2.AutomaticioPractice.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MyPersonalInformationPage extends BasePage {

    public MyPersonalInformationPage(WebDriver remoteDriver){

        driver = remoteDriver;
        PageFactory.initElements(driver, this);
    }
    public String checkingPersonalInformation(){

        return firstNameFieldElement.getAttribute("value") + " " + lastNameFieldElement.getAttribute("value");

    }
}
