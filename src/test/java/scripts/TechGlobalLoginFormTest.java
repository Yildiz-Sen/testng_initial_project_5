package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalFrontEndTestingHomePage;
import pages.TechGlobalFrontEndTestingHomePage;
import pages.TechGlobalLoginFormPage;

public class TechGlobalLoginFormTest extends TechGlobalBase {
    @BeforeMethod
    public void setPage() {
        techGlobalFrontendTestingHomePage = new TechGlobalFrontEndTestingHomePage();
        techGlobalLoginFormPage = new TechGlobalLoginFormPage();
        techGlobalFrontendTestingHomePage.headerDropdown.click();
        techGlobalFrontendTestingHomePage.headerDropdownOptions.get(0).click();
        techGlobalFrontendTestingHomePage.clickOnCard(15);
    }

    @Test(priority = 1, description = "Validate Login Form card")
    public void validateLoginFormCard() {
        // Validate heading visibility and text
        Assert.assertTrue(techGlobalLoginFormPage.mainHeading.isDisplayed());
        Assert.assertEquals(techGlobalLoginFormPage.mainHeading.getText(), "Login Form");

        // Validate username label visibility and text
        Assert.assertTrue(techGlobalLoginFormPage.usernameLabel.isDisplayed());
        Assert.assertEquals(techGlobalLoginFormPage.usernameLabel.getText(), "Please enter your username");
        Assert.assertTrue(techGlobalLoginFormPage.usernameInputField.isDisplayed());

        // Validate password label visibility and text
        Assert.assertTrue(techGlobalLoginFormPage.passwordLabel.isDisplayed());
        Assert.assertEquals(techGlobalLoginFormPage.passwordLabel.getText(), "Please enter your password");
        Assert.assertTrue(techGlobalLoginFormPage.passwordInputField.isDisplayed());

        // Validate login button visibility and text
        Assert.assertTrue(techGlobalLoginFormPage.loginButton.isDisplayed());
        Assert.assertEquals(techGlobalLoginFormPage.loginButton.getText(), "LOGIN");

        // Validate forgot password link visibility and text
        Assert.assertTrue(techGlobalLoginFormPage.forgotPasswordLink.isDisplayed());
        Assert.assertEquals(techGlobalLoginFormPage.forgotPasswordLink.getText(), "Forgot Password?");
    }

    @Test (priority = 2, description = "Validate login")
    public void validateTechGlobalLogin(){
        techGlobalLoginFormPage.usernameInputField.sendKeys("TechGlobal");
        techGlobalLoginFormPage.passwordInputField.sendKeys("Test1234");
        techGlobalLoginFormPage.loginButton.click();

        Assert.assertTrue(techGlobalLoginFormPage.loginSuccessful.isDisplayed());
        Assert.assertTrue(techGlobalLoginFormPage.logoutButton.isDisplayed());

    }

    @Test(priority = 3, description = "Validate login and logout")
    public void validateTechGlobalLoginAndLogout(){
        techGlobalLoginFormPage.usernameInputField.sendKeys("TechGlobal");
        techGlobalLoginFormPage.passwordInputField.sendKeys("Test1234");
        techGlobalLoginFormPage.loginButton.click();
        techGlobalLoginFormPage.logoutButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://techglobal-training.netlify.app/frontend/login-form");
    }

    @Test(priority = 4, description = "Validate forgot password")
    public void validateTechGlobalForgotPassword(){
        techGlobalLoginFormPage.forgotPasswordLink.click();
        Assert.assertTrue(techGlobalLoginFormPage.resetPassword.isDisplayed());
        Assert.assertTrue(techGlobalLoginFormPage.resetPasswordMessage.isDisplayed());
        Assert.assertTrue(techGlobalLoginFormPage.emailInputBox.isDisplayed());
        Assert.assertTrue(techGlobalLoginFormPage.submitButton.isDisplayed());
    }

    @Test(priority = 5, description = "Validate reset password link")
    public void validateResetPasswordLink(){
        techGlobalLoginFormPage.forgotPasswordLink.click();
        techGlobalLoginFormPage.emailInputBox.sendKeys("yildizsen93@gmail.com");
        techGlobalLoginFormPage.submitButton.click();
        Assert.assertTrue(techGlobalLoginFormPage.emailConfirmationMessage.isDisplayed());
    }

    @Test(priority = 6, description = "Validate invalid username login")
    public void validateInvalidUsernameLogin(){
        techGlobalLoginFormPage.usernameInputField.sendKeys("john");
        techGlobalLoginFormPage.passwordInputField.sendKeys("Test1234");
        techGlobalLoginFormPage.loginButton.click();
        Assert.assertTrue(techGlobalLoginFormPage.loginErrorMessage.isDisplayed());
    }

    @Test(priority = 7, description = "Validate invalid password login")
    public void validateInvalidPasswordLogin(){
        techGlobalLoginFormPage.usernameInputField.sendKeys("TechGlobal");
        techGlobalLoginFormPage.passwordInputField.sendKeys("1234");
        techGlobalLoginFormPage.loginButton.click();
        Assert.assertTrue(techGlobalLoginFormPage.loginErrorMessage.isDisplayed());
    }

    @Test(priority = 8, description = "Validate invalid password and username")
    public void validateInvalidPasswordAndUsername(){
        techGlobalLoginFormPage.usernameInputField.sendKeys("john");
        techGlobalLoginFormPage.passwordInputField.sendKeys("1234");
        techGlobalLoginFormPage.loginButton.click();
        Assert.assertTrue(techGlobalLoginFormPage.loginErrorMessage.isDisplayed());
    }
}