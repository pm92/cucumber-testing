package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.AddItemsLocators;
import pages.locators.HomePageLocators;
import utils.SeleniumDriver;
import utils.SeleniumHelper;

public class AddItemsActions {

    private AddItemsLocators locators;

    public AddItemsActions() {
        locators = new AddItemsLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public void addItems(String itemType, String amount) {
        locators.itemTypeInput.sendKeys(itemType);
        locators.amountInput.sendKeys(amount);
        locators.addButton.click();
    }

    public boolean isItemsAdded(){ return SeleniumHelper.isElementPresent(locators.deleteButton);}
}
