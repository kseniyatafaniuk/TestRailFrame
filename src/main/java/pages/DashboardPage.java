package pages;

import core.BrowserService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DashboardPage extends CommonHeader {

    private static final By sidebarProjectsAddButtonBy = By.id("sidebar-projects-add");

    public DashboardPage(BrowserService browserService) {
        super(browserService, "/dashboard");
    }

    @Override
    protected By getPageOpenedIndicatorLocator() {
        return sidebarProjectsAddButtonBy;
    }

    public WebElement getSidebarProjectsAddButton() {
        return this.browserService.getDriver().findElement(sidebarProjectsAddButtonBy);
    }

}
