package pages.actions;


import org.openqa.selenium.support.PageFactory;
import pages.locators.LoginPageLocators;
import utils.SeleniumDriver;

public class LoginPageActions {

    private LoginPageLocators locators;

    public LoginPageActions() {
        this.locators = new LoginPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public void signInUser(String username, String password) {
        locators.usernameInput.sendKeys(username);
        locators.passwordInput.sendKeys(password);
        locators.signInButton.click();
    }
}
