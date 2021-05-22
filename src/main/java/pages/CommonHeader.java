package pages;

import baseEntitites.BasePage;
import core.BrowserService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class CommonHeader extends BasePage {

    private static final By topPanelBy = By.className("top-panel");
    private static final By administrationButtonBy = By.id("navigation-admin");

    public CommonHeader(BrowserService browserService, String path) {
        super(browserService,path);
    }

    public WebElement getAdministrationButton() {
        return this.browserService.getDriver().findElement(administrationButtonBy);
    }
}
