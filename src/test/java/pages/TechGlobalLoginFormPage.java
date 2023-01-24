package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TechGlobalLoginFormPage extends TechGlobalBasePage {
    public TechGlobalLoginFormPage() {
        super();
    }

    @FindBy(id = "main_heading")
    public WebElement mainHeading;

    @FindBy(css = "label[for='username']")
    public WebElement usernameLabel;

    @FindBy(id = "username")
    public WebElement usernameInputField;

    @FindBy(css = "label[for='password']")
    public WebElement passwordLabel;

    @FindBy(id = "password")
    public WebElement passwordInputField;

    @FindBy(id = "login_btn")
    public WebElement loginButton;

    @FindBy(id = "forgot-password")
    public WebElement forgotPasswordLink;

    @FindBy(id = "success_lgn")
    public WebElement loginSuccessful;

    @FindBy(id = "logout")
    public WebElement logoutButton;

    @FindBy(id = "sub_heading")
    public WebElement resetPassword;

    @FindBy(css = "label[for=email]")
    public WebElement resetPasswordMessage;

    @FindBy(id = "email")
    public WebElement emailInputBox;

    @FindBy(id = "submit")
    public WebElement submitButton;

    @FindBy(id = "confirmation_message")
    public WebElement emailConfirmationMessage;

    @FindBy(id = "error_message")
    public WebElement loginErrorMessage;
}