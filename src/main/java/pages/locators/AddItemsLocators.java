package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddItemsLocators {

    @FindBy(how = How.XPATH, using = ".//*[@id='itemType']")
    public WebElement itemTypeInput;

    @FindBy(how = How.XPATH, using = ".//*[@id='amount']")
    public WebElement amountInput;

    @FindBy(how = How.XPATH, using = "html/body/form/table/tbody/tr[3]/td/button")
    public WebElement addButton;

    @FindBy(how = How.XPATH, using = "html/body/table/tbody/tr[2]/td[1]/form/input[2]")
    public WebElement deleteButton;



}
