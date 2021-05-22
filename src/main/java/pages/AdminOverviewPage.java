package pages;

import core.BrowserService;

public class AdminOverviewPage extends AdminSidebarPage{

    public AdminOverviewPage(BrowserService browserService) {
        super(browserService, "/admin/overview");
    }
}
