package steps;

import baseEntitites.BaseStep;
import core.BrowserService;
import pages.AdminOverviewPage;
import pages.AdminProjectsPage;

public class AdminOverviewPageSteps extends BaseStep<AdminOverviewPage> {

    public AdminOverviewPageSteps(BrowserService browserService) {
        super(browserService);
    }

    @Override
    public AdminOverviewPageSteps openPage() {
        this.page.open();
        return this;
    }

    public AdminProjectsPageSteps openAdminProjectsPage(){
        this.page.getSidebarProjectsLink().click();
        return new AdminProjectsPageSteps(this.browserService);
    }
}
