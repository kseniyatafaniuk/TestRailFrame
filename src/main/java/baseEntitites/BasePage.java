package baseEntitites;

import core.BrowserService;
import core.PropertyReader;
import core.PropertyReader_old;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    protected BrowserService browserService;
    private final static String BASE_URL = PropertyReader.getUrl();
    private final String path;

    public BasePage(BrowserService browserService, String path) {
        this.browserService = browserService;
        this.path = path;
    }

    protected abstract By getPageOpenedIndicatorLocator();

    public void open() {
        if (path != null) {
            this.browserService.getDriver().get(BASE_URL + path);
        }
        try {
            this.browserService.getWait().waitForVisibility(getPageOpenedIndicatorLocator());
        } catch (TimeoutException ex) {
            throw new AssertionError("Page was not opened.");
        }
    }

}
