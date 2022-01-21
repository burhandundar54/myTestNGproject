package techproed.tests.smoketest;

import org.testng.annotations.Test;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigurationReader;
import techproed.utilities.Driver;

public class  Day13_PositiveLogin {

    LoginPage loginPage = new LoginPage();

    @Test
    public void positiveLogin() throws InterruptedException {

        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_login_url"));
        loginPage.loginDropDown.click();
        loginPage.signInButton.click();
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("employee_username"));
        Thread.sleep(5000);
        loginPage.passWord.sendKeys(ConfigurationReader.getProperty("employee_password"));
        Thread.sleep(5000);
        loginPage.submitButton.click();

    }

}