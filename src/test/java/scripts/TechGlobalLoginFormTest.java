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

}