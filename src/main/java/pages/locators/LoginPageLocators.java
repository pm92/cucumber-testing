package pages.locators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageLocators {

    @FindBy(how = How.NAME, using = "username")
    public WebElement usernameInput;

    @FindBy(how = How.NAME, using = "password")
    public WebElement passwordInput;

    @FindBy(how = How.XPATH, using = "//input[@value='Sign In']")
    public WebElement signInButton;
}
