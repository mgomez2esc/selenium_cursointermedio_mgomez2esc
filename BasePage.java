package SeleniumIntermedio.Practico2.AutomaticioPractice.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BasePage {

    public WebDriver driver;

    @FindBy (xpath = "//*[@href='http://automationpractice.com/index.php?controller=my-account']")
    public WebElement loginBtn;

    @FindBy (id = "email_create")
    public WebElement newEmailAccount;

    @FindBy (id = "SubmitCreate")
    public WebElement createNewAccountBtn;

    @FindBy (id = "email")
    public WebElement emailAccountAlreadyCreatedElement;

    @FindBy (id = "passwd")
    public WebElement passwordFromAccountAlreadyCreatedElement;

    @FindBy (id = "SubmitLogin")
    public WebElement signInBtnElement;

    @FindBy (xpath = "//*[@id='id_gender1']")
    public WebElement genderRadioBtn;

    @FindBy (id = "customer_firstname")
    public WebElement firstNameElement;

    @FindBy (name = "days")
    public WebElement dayBirthElement;

    @FindBy (name = "months")
    public WebElement monthBirthElement;

    @FindBy (name = "years")
    public WebElement yearBirthElement;

    @FindBy (id = "customer_lastname")
    public WebElement lastNameElement;

    @FindBy (id = "firstname")
    public WebElement firstNameFieldElement;

    @FindBy (id = "lastname")
    public WebElement lastNameFieldElement;

    @FindBy (id = "company")
    public WebElement companyFieldElement;

    @FindBy (id = "address1")
    public WebElement addressFieldElement;

    @FindBy (id = "city")
    public WebElement cityFieldElement;

    @FindBy (id = "id_state")
    public WebElement USTateElement;

    @FindBy (id = "postcode")
    public WebElement postCodeFieldElement;

    @FindBy (name = "other")
    public WebElement otherFieldElement;

    @FindBy (id = "phone_mobile")
    public WebElement mobilePhoneFieldElement;

    @FindBy (id = "submitAccount")
    public WebElement submitNewAccountBthElement;

    @FindBy (xpath = "//*[@href='http://automationpractice.com/index.php?mylogout=']")
    public WebElement signOutBtn;

    @FindBy (xpath = "//*[@href='http://automationpractice.com/index.php?controller=identity']")
    public WebElement myPersonalInformationBtnElement;

    @FindBy (xpath = "//*[@class='account']")
    public WebElement accountNameBtnElement;

    @FindBy (xpath = "//*[@class='alert alert-danger']/ol/li")
    public WebElement invalidEmailElement;

    @FindBy (xpath = "//*[@class='alert alert-danger']/ol/li")
    public List<WebElement> listErrorNewAccount;

    public String getTitlePage(){

        return driver.getTitle();
    }
    public String getCurrentURLPage(){

        return driver.getCurrentUrl();
    }
}
