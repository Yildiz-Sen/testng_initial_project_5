package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalFrontEndTestingHomePage;
import pages.TechGlobalLoginFormPage;

public class ValidateInvalidPasswordAndUsername extends TechGlobalBase{
    @BeforeMethod
    public void setPage() {
        techGlobalFrontendTestingHomePage = new TechGlobalFrontEndTestingHomePage();
        techGlobalLoginFormPage = new TechGlobalLoginFormPage();
        techGlobalFrontendTestingHomePage.headerDropdown.click();
        techGlobalFrontendTestingHomePage.headerDropdownOptions.get(0).click();
        techGlobalFrontendTestingHomePage.clickOnCard(15);
    }

    @Test
    public void validateInvalidPasswordAndUsername(){
        techGlobalLoginFormPage.usernameInputField.sendKeys("john");
        techGlobalLoginFormPage.passwordInputField.sendKeys("1234");
        techGlobalLoginFormPage.loginButton.click();
        Assert.assertTrue(techGlobalLoginFormPage.loginErrorMessage.isDisplayed());
    }
}
