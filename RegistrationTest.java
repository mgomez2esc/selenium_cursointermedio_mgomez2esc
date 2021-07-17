package SeleniumIntermedio.Practico2.AutomaticioPractice.Tests;

import SeleniumIntermedio.Practico2.AutomaticioPractice.PageObject.MyAccountPage;
import SeleniumIntermedio.Practico2.AutomaticioPractice.PageObject.MyPersonalInformationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {

    @Test
    public void newAccount() throws InterruptedException {

        newAccountPage = authenticationPage.newAccount(emailAccount);

        Assert.assertEquals(emailAccount, newAccountPage.checkingSameTypedEmailAccount(), "Another email account is expected");

        MyAccountPage myAccountPage = newAccountPage.fillingInPersonalInformation();
        Assert.assertEquals(myAccountPage.signOutBtn().getText(), "Sign out");

        MyPersonalInformationPage myPersonalInformationPage = myAccountPage.checkingPersonalInformation();
        Assert.assertEquals(fullName, myPersonalInformationPage.checkingPersonalInformation(), "The information is different");
    }
    @Test
    public void newAccountNoInformationError(){

        newAccountPage = authenticationPage.newAccount(emailAccount);
        newAccountPage.clickingSubmitBtn();

        Assert.assertEquals(newAccountPage.listErrorNewAccount.size(), 8);

    }

}