package pages;

import baseEntitites.BasePage;
import core.BrowserService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HeaderPage extends BasePage {

    private static final By topPanelBy = By.className("top-panel");
    private static final By administrationButtonBy = By.id("navigation-admin");

    public HeaderPage(BrowserService browserService, String path) {
        super(browserService,""); //вот тут чёт не уверена, у этой пейджи нет паса
    }

    @Override
    protected By getPageOpenedIndicatorLocator() {
        return topPanelBy;
    }

    public WebElement getAdministrationButton() {
        return this.browserService.getDriver().findElement(administrationButtonBy);
    }
}
