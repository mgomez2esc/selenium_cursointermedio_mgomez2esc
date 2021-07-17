package SeleniumIntermedio.Practico2.AutomaticioPractice.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends BasePage{

    public MyAccountPage(WebDriver remoteDriver){

        driver = remoteDriver;
        PageFactory.initElements(driver, this);
    }
    public String nameAccountBtn(){

        return accountNameBtnElement.getText();
    }
    public WebElement signOutBtn(){

        return signOutBtn;
    }
    public MyPersonalInformationPage checkingPersonalInformation(){

        myPersonalInformationBtnElement.click();

        MyPersonalInformationPage nextPage = new MyPersonalInformationPage(driver);

        return nextPage;
    }
}
