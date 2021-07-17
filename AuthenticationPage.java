package SeleniumIntermedio.Practico2.AutomaticioPractice.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage extends BasePage {

    public AuthenticationPage(WebDriver remoteDriver){

        this.driver = remoteDriver;
        PageFactory.initElements(driver, this);
    }
    public NewAccountPage newAccount(String emailRandomAccount){

        newEmailAccount.sendKeys(emailRandomAccount);

        createNewAccountBtn.click();

        NewAccountPage nextPage = new NewAccountPage(driver);

        return nextPage;
    }
    public void signInAccountAlreadyCreated(String anEmail, String aPassword){

        emailAccountAlreadyCreatedElement.sendKeys(anEmail);
        passwordFromAccountAlreadyCreatedElement.sendKeys(aPassword);

        signInBtnElement.click();

    }
    public String IncorrectMailError(){

        return invalidEmailElement.getText();
    }
}
