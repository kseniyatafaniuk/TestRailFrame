package pages;

import core.BrowserService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdminSidebarPage extends HeaderPage {

    private static final By sidebarProjectsLinkBy = By.id("navigation-sub-projects");

    public AdminSidebarPage(BrowserService browserService, String path) {
        super(browserService, path);
    }

    public WebElement getSidebarProjectsLink() {
        return this.browserService.getDriver().findElement(sidebarProjectsLinkBy);
    }

}
