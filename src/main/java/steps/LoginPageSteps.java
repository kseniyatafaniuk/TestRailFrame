package steps;

import baseEntitites.BaseStep;
import core.BrowserService;
import pages.LoginPage;

public class LoginPageSteps extends BaseStep<LoginPage> {

    public LoginPageSteps(BrowserService browserService) {
        super(browserService);
    }

    @Override
    public LoginPageSteps openPage() {
        this.page.open();
        return this;
    }

    public DashboardPageSteps loginWithCorrectCreds(String email, String psw){
        this.page.getEmailInput().sendKeys(email);
        this.page.getPassInput().sendKeys(psw);
        this.page.getLoginBtn().click();
        return new DashboardPageSteps(this.browserService);
    }
}
