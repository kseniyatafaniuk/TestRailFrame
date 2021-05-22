package pages.adminPages;

import core.BrowserService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonHeader;

public abstract class AdminSidebar extends CommonHeader {

    private static final By sidebarProjectsLinkBy = By.id("navigation-sub-projects");
    protected static final String pageTitleLocator = "//div[contains(@class,'page_title') and contains(text(),'%s')]";


    public AdminSidebar(BrowserService browserService, String path) {
        super(browserService, path);
    }

    public WebElement getSidebarProjectsLink() {
        return this.browserService.getDriver().findElement(sidebarProjectsLinkBy);
    }

}
