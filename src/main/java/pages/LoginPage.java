package pages;

import baseEntitites.BasePage;
import core.BrowserService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private static final By loginButtonBy = By.id("button_primary");
    private static final By emailInputBy = By.id("name");
    private static final By passInputBy = By.id("password");
    private static final By errorLabelBy = By.className("error-text");
    private static final By fieldErrorBy = By.className("loginpage-message-image");

    public LoginPage(BrowserService browserService) {
        super(browserService, "/auth/login");
    }

    @Override
    protected By getPageOpenedIndicatorLocator() {
        return loginButtonBy;
    }

    public WebElement getEmailInput() {
        return this.browserService.getDriver().findElement(emailInputBy);
    }

    public WebElement getPassInput() {
        return this.browserService.getDriver().findElement(passInputBy);
    }

    public WebElement getLoginBtn() {
        return this.browserService.getDriver().findElement(loginButtonBy);
    }

    public WebElement getErrorLabel() {
        return this.browserService.getDriver().findElement(errorLabelBy);
    }

    public WebElement getFieldError() {
        return this.browserService.getDriver().findElement(fieldErrorBy);
    }
}
