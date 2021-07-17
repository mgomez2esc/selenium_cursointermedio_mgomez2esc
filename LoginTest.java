package SeleniumIntermedio.Practico2.AutomaticioPractice.Tests;

import SeleniumIntermedio.Practico2.AutomaticioPractice.Constants.Constants;
import SeleniumIntermedio.Practico2.AutomaticioPractice.PageObject.MyAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void SignInAccount(){

        Assert.assertEquals(authenticationPage.getTitlePage(), "Login - My Store");
        Assert.assertEquals(authenticationPage.getCurrentURLPage(), "http://automationpractice.com/index.php?controller=authentication&back=my-account");

        newAccountPage = authenticationPage.newAccount(emailAccount);

        MyAccountPage myAccountPage = newAccountPage.fillingInPersonalInformation();

        Assert.assertEquals(authenticationPage.getTitlePage(), "My account - My Store");
        Assert.assertEquals(authenticationPage.getCurrentURLPage(), "http://automationpractice.com/index.php?controller=my-account");

        myAccountPage.signOutBtn.click();

        authenticationPage.signInAccountAlreadyCreated(emailAccount, Constants.PASSWORD);

        Assert.assertEquals(myAccountPage.signOutBtn.getText(), "Sign out");
        Assert.assertEquals(fullName, myAccountPage.nameAccountBtn());
    }
    @Test
    public void SignInFailAccount(){

        authenticationPage.newAccount("invalidEmail");

        Assert.assertTrue(authenticationPage.IncorrectMailError().contains("Invalid"));

    }


}
