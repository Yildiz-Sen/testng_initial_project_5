package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1Test extends TechGlobalBase{

    @Test
    public void validateTechGlobalLogo() {
        Assert.assertTrue(techGlobalBasePage.loginFormHeading.isDisplayed());
    }
}
