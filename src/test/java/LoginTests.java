import core.BrowserService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import steps.DashboardPageSteps;
import steps.LoginPageSteps;

public class LoginTests {

    private BrowserService browserService;

    @BeforeClass
    public void setUp(){
        browserService = new BrowserService();
    }

    @Test
    public void loginWithCorrectCreds(){

        LoginPageSteps loginPageSteps = new LoginPageSteps(browserService);
        DashboardPageSteps dashboardPageSteps = loginPageSteps
                .openPage()
                .loginWithCorrectCreds("atrostyanko+0401@gmail.com", "QqtRK9elseEfAk6ilYcJ");
    }
}
