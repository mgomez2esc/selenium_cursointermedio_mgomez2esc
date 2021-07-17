package SeleniumIntermedio.Practico2.AutomaticioPractice.Tests;

import SeleniumIntermedio.Practico2.AutomaticioPractice.Constants.Constants;
import SeleniumIntermedio.Practico2.AutomaticioPractice.PageObject.LandingPage;
import SeleniumIntermedio.Practico2.AutomaticioPractice.PageObject.NewAccountPage;
import SeleniumIntermedio.Practico2.AutomaticioPractice.PageObject.AuthenticationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;
    public LandingPage landingPage;
    public AuthenticationPage authenticationPage;
    public String emailAccount;
    public String fullName = Constants.FAKER_FIRST_NAME + " " + Constants.FAKER_LAST_NAME;
    public NewAccountPage newAccountPage;
    public static final String AUTOMATIONPRACTICE_URL = "http://automationpractice.com/index.php?";

    @BeforeMethod
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mgomez\\Documents\\SeleniumTest\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(AUTOMATIONPRACTICE_URL);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        PageFactory.initElements(driver,this);

        landingPage = new LandingPage(driver);
        authenticationPage = landingPage.signIn();

        emailAccount = "testing" + Math.random() + "@gmail.com";



    }
}