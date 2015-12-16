package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.actions.AddItemsActions;
import pages.actions.HomePageActions;
import pages.actions.LoginPageActions;

public class AddingSteps {


    private HomePageActions homePageActions;
    private LoginPageActions loginPageActions;
    private AddItemsActions addItemsActions;

    public AddingSteps() {
        this.homePageActions = new HomePageActions();
        this.loginPageActions = new LoginPageActions();
        this.addItemsActions = new AddItemsActions();
    }
    @Given("^I am on adding items page$")
    public void iAmOnAddingItemsPage() throws Throwable {
        homePageActions.openHomePage();
        homePageActions.goToLoginPage();
        loginPageActions.signInUser("artur", "123456");
        homePageActions.goToAddItemsPage();
    }
    @When("^I enter correct value$")
    public void iEnterCorrectValue() throws Throwable {
        addItemsActions.addItems("Laptop","4");
    }

    @Then("^I should be adding some items$")
    public void iShouldBeAddingSomeItems() throws Throwable {

        Assert.assertTrue(addItemsActions.isItemsAdded());
    }


}
