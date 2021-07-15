package SeleniumIntermedio.Practico2.AutomaticioPractice.PageObject;

import SeleniumIntermedio.Practico2.AutomaticioPractice.Constants.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class NewAccountPage extends BasePage {

    public NewAccountPage(WebDriver remoteDriver){

        driver = remoteDriver;
        PageFactory.initElements(driver, this);
    }
    public String checkingSameTypedEmailAccount() throws InterruptedException {

        Thread.sleep(3000);

        return emailAccountAlreadyCreatedElement.getAttribute("value");

    }
    public void clickingSubmitBtn(){

        submitNewAccountBthElement.click();
    }
    public MyAccountPage fillingInPersonalInformation(){

        genderRadioBtn.click();

        firstNameElement.sendKeys(Constants.FAKER_FIRST_NAME);
        lastNameElement.sendKeys(Constants.FAKER_LAST_NAME);
        passwordFromAccountAlreadyCreatedElement.sendKeys(Constants.PASSWORD);
        dayBirthElement.sendKeys(Constants.BIRTH_DAY);
        Select selectMonth = new Select(monthBirthElement);
        selectMonth.selectByValue("2");
        yearBirthElement.sendKeys(Constants.BIRTH_YEAR);
        firstNameFieldElement.sendKeys(Constants.FAKER_FIRST_NAME);
        lastNameFieldElement.sendKeys(Constants.FAKER_LAST_NAME);
        companyFieldElement.sendKeys(Constants.COMPANY);
        addressFieldElement.sendKeys(Constants.ADDRESS);
        cityFieldElement.sendKeys(Constants.CITY);
        Select selectState = new Select(USTateElement);
        selectState.selectByValue("21");
        postCodeFieldElement.sendKeys(Constants.POSTCODE);
        otherFieldElement.sendKeys(Constants.OTHERS);
        mobilePhoneFieldElement.sendKeys(Constants.MOBILEPHONE);

        clickingSubmitBtn();

        MyAccountPage nextPage = new MyAccountPage(driver);

        return nextPage;

    }
    public String nameAccountBtn(){

        return accountNameBtnElement.getText();
    }
    public List<WebElement> listError(){

        Assert.assertNotEquals(listErrorNewAccount.size(), 0);

        return listErrorNewAccount;
    }

}
