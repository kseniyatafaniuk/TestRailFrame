package pages.dialogues;

import baseEntitites.BasePage;
import core.BrowserService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DeleteProjectDialogue extends BasePage {

    private static final By confirmationCheckboxBy =
            By.xpath("//div[@aria-labelledby='ui-dialog-title-deleteDialog']/descendant::input");
    private static final By okButtonBy =
            By.xpath("//div[@aria-labelledby='ui-dialog-title-deleteDialog']/descendant::a[contains(@class,'button-ok')]");


    public DeleteProjectDialogue(BrowserService browserService) {
        super(browserService,"");
    }

    @Override
    protected By getPageOpenedIndicatorLocator() {
        return okButtonBy;
    }

    public WebElement getConfirmationCheckbox() {
        return this.browserService.getDriver().findElement(confirmationCheckboxBy);
    }

    public WebElement getOkButton() {
        return this.browserService.getDriver().findElement(okButtonBy);
    }
}
