package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalFrontEndTestingHomePage;
import pages.TechGlobalLoginFormPage;

public class ValidateResetPasswordLink extends TechGlobalBase{
    @BeforeMethod
    public void setPage() {
        techGlobalFrontendTestingHomePage = new TechGlobalFrontEndTestingHomePage();
        techGlobalLoginFormPage = new TechGlobalLoginFormPage();
        techGlobalFrontendTestingHomePage.headerDropdown.click();
        techGlobalFrontendTestingHomePage.headerDropdownOptions.get(0).click();
        techGlobalFrontendTestingHomePage.clickOnCard(15);
    }
    @Test
    public void validateResetPasswordLink(){
        techGlobalLoginFormPage.forgotPasswordLink.click();
        techGlobalLoginFormPage.emailInputBox.sendKeys("yildizsen93@gmail.com");
        techGlobalLoginFormPage.submitButton.click();
        Assert.assertTrue(techGlobalLoginFormPage.emailConfirmationMessage.isDisplayed());
    }
}
