package utils;

import core.BrowserService;
import core.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiter {
//    private final BrowserService browserService;
    private final WebDriverWait wait;

    public Waiter(BrowserService browserService) {
//        this.browserService = browserService;
        this.wait = new WebDriverWait(browserService.getDriver(), new PropertyReader().getTimeOut());
    }

    public Waiter(BrowserService browserService, int timeOut) {
//        this.browserService = browserService;
        this.wait = new WebDriverWait(browserService.getDriver(), timeOut);
    }

    public WebElement waitForVisibility(By by){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public WebElement waitForVisibility(WebElement webElement){
        return wait.until(ExpectedConditions.visibilityOf(webElement));
    }
}
