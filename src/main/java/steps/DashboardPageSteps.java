package steps;

import baseEntitites.BaseStep;
import core.BrowserService;
import pages.DashboardPage;

public class DashboardPageSteps extends BaseStep<DashboardPage> {

    public DashboardPageSteps(BrowserService browserService) {
        super(browserService);
    }

    @Override
    public DashboardPageSteps openPage() {
        this.page.open();
        return this;
    }

    public AdminOverviewPageSteps openAdminPage(){
        this.page.getAdministrationButton().click();
        return new AdminOverviewPageSteps(this.browserService);
    }
}
