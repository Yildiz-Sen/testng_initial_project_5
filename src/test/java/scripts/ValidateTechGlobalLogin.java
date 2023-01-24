package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalFrontEndTestingHomePage;
import pages.TechGlobalLoginFormPage;

public class ValidateTechGlobalLogin extends TechGlobalBase{
    @BeforeMethod
    public void setPage() {
        techGlobalFrontendTestingHomePage = new TechGlobalFrontEndTestingHomePage();
        techGlobalLoginFormPage = new TechGlobalLoginFormPage();
        techGlobalFrontendTestingHomePage.headerDropdown.click();
        techGlobalFrontendTestingHomePage.headerDropdownOptions.get(0).click();
        techGlobalFrontendTestingHomePage.clickOnCard(15);
    }
    @Test
    public void validateTechGlobalLogin(){
        techGlobalLoginFormPage.usernameInputField.sendKeys("TechGlobal");
        techGlobalLoginFormPage.passwordInputField.sendKeys("Test1234");
        techGlobalLoginFormPage.loginButton.click();

        Assert.assertTrue(techGlobalLoginFormPage.loginSuccessful.isDisplayed());
        Assert.assertTrue(techGlobalLoginFormPage.logoutButton.isDisplayed());
    }
}
