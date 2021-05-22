package pages.adminPages;

import core.BrowserService;
import org.openqa.selenium.By;

public class AdminOverviewPage extends AdminSidebar {

    public AdminOverviewPage(BrowserService browserService) {
        super(browserService, "/admin/overview");
    }

    @Override
    protected By getPageOpenedIndicatorLocator() {
        return By.xpath(String.format(pageTitleLocator,"Overview"));
    }

}
