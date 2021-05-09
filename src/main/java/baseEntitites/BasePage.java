package baseEntitites;

import core.BrowserService;
import core.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    protected BrowserService browserService;
    protected WebDriver driver;
    protected final static String BASE_URL = new PropertyReader().getUrl();
    protected final String path;

    public BasePage(BrowserService browserService, String path) {
        this.browserService = browserService;
        this.driver = browserService.getDriver();
        this.path = path;
    }

    protected abstract By getPageOpenedIndicatorLocator();

    public void open() {
        this.driver.get(BASE_URL + path);
        try {
            this.browserService.getWait().waitForVisibility(getPageOpenedIndicatorLocator());
        } catch (TimeoutException ex) {
            throw new AssertionError("Page was not opened.");
        }
    }

}
