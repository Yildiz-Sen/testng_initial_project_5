package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TestCase1 extends TechGlobalBasePage{

    /*
    Given user is on https://techglobal-training.netlify.app/
    When user clicks on "Practices" dropdown in the header
    And user select the "Frontend Testing" option
    And user clicks on the "Login Form" card
    Then user should heading1 as “Login Form”
    And user should see “Please enter your username” label and username input box
    And user should see “Please enter your password” label and password input box
    And user should see “LOGIN” button
    And user should see “Forgot Password?” link
     */
        public TestCase1() {
            PageFactory.initElements(Driver.getDriver(), this);
        }


    public void clickOnCard(String cardText){
        for (WebElement card : cards) {
            if(card.getText().equals(cardText)){
                card.click();
                break;
            }
        }
    }

    public void clickOnCard(int index){
        cards.get(index).click();
    }
    public void getFrontendTestingPage() throws InterruptedException {
        headerDropdown.click();
        Thread.sleep(200);
        headerDropdownOptions.get(0).click();
        Thread.sleep(200);
    }

    @FindBy(css = "div[id^='card']")
    public List<WebElement> cards;



}
