package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.actions.HomePageActions;
import pages.actions.LoginPageActions;


public class LoginSteps {

    private HomePageActions homePageActions;
    private LoginPageActions loginPageActions;

    public LoginSteps() {
        this.homePageActions = new HomePageActions();
        this.loginPageActions = new LoginPageActions();
    }

    @Given("^I am on login page$")
    public void I_am_on_login_page() throws Throwable {
        homePageActions.openHomePage();
        homePageActions.goToLoginPage();
    }

    @When("^I enter correct credentials$")
    public void I_enter_correct_credentials() throws Throwable {
        loginPageActions.signInUser("artur", "123456");
    }

    @Then("^I should be signed in$")
    public void I_should_be_signed_in() throws Throwable {
        Assert.assertTrue(homePageActions.isLogoutButton());
    }

    @Given("^I am logged into the system$")
    public void iAmLoggedIntoTheSystem() throws Throwable {
        I_am_on_login_page();
        loginPageActions.signInUser("artur", "123456");
    }

    @When("^I logout from system$")
    public void iLogoutFromSystem() throws Throwable {
        homePageActions.logoutFromSystem();
    }

    @Then("^I am logged out$")
    public void iAmLoggedOut() throws Throwable {
        Assert.assertTrue(homePageActions.isUserNotLogged());
    }

    @Given("^I am logged into the system as user \"([^\"]*)\" with password \"([^\"]*)\"$")
    public void iAmLoggedIntoTheSystemAsUserWithPassword(String login, String password) throws Throwable {
        I_am_on_login_page();
        loginPageActions.signInUser(login, password);
    }
}
