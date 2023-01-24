package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalFrontEndTestingHomePage;
import pages.TechGlobalLoginFormPage;

public class ValidateInvalidPasswordLogin extends TechGlobalBase{
    @BeforeMethod
    public void setPage() {
        techGlobalFrontendTestingHomePage = new TechGlobalFrontEndTestingHomePage();
        techGlobalLoginFormPage = new TechGlobalLoginFormPage();
        techGlobalFrontendTestingHomePage.headerDropdown.click();
        techGlobalFrontendTestingHomePage.headerDropdownOptions.get(0).click();
        techGlobalFrontendTestingHomePage.clickOnCard(15);
    }

    @Test
    public void validateInvalidPasswordLogin(){
        techGlobalLoginFormPage.usernameInputField.sendKeys("TechGlobal");
        techGlobalLoginFormPage.passwordInputField.sendKeys("1234");
        techGlobalLoginFormPage.loginButton.click();
        Assert.assertTrue(techGlobalLoginFormPage.loginErrorMessage.isDisplayed());
    }
}
