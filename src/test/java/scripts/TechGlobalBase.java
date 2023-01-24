package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalBasePage;
import pages.TechGlobalFrontEndTestingHomePage;
import pages.TechGlobalLoginFormPage;
import utilities.ConfigProperties;
import utilities.Driver;

public class TechGlobalBase {
    WebDriver driver;
    TechGlobalBasePage techGlobalBasePage;

    TechGlobalFrontEndTestingHomePage techGlobalFrontendTestingHomePage;
    TechGlobalLoginFormPage techGlobalLoginFormPage;

    @BeforeMethod
    public void setup() {
        driver = Driver.getDriver();
        driver.get(ConfigProperties.getProperty("appURL"));
        //driver.get("https://techglobal-training.netlify.app/");

        techGlobalBasePage = new TechGlobalBasePage(); // we must initialize this because we are using elements from base page
        //before methods executes this
    }

    @AfterMethod
    public void teardown() {
        Driver.quitDriver();
    }

    @Test
    public void test(){
        techGlobalBasePage.headerDropdown.click();
        techGlobalBasePage.headerDropdownOptions.get(0).click();
    }
}
