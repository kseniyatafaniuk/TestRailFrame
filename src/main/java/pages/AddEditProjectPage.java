package pages;

import core.BrowserService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddEditProjectPage extends AdminSidebarPage {

    private static final By nameInputBy = By.id("name");
    private static final By announcementInputBy = By.id("announcement");
    private static final By isAnnouncementShownCheckboxBy = By.id("show_announcement");
    private static final By addButtonBy = By.id("accept");
    private static final String selectProjectTypeRadioBttnLocator = "//div[@class='table']/descendant::input[@class='radio'][@value='%s']";

    public AddEditProjectPage(BrowserService browserService) {
        super(browserService, "");
    }

    public WebElement getNameInput() {
        return this.browserService.getDriver().findElement(nameInputBy);
    }

    public WebElement getAnnouncementInput() {
        return this.browserService.getDriver().findElement(announcementInputBy);
    }

    public WebElement getIsAnnouncementShownCheckbox() {
        return this.browserService.getDriver().findElement(isAnnouncementShownCheckboxBy);
    }

    public WebElement getAddButton() {
        return this.browserService.getDriver().findElement(addButtonBy);
    }

    public WebElement getSelectProjectTypeRadioBttn(String value) {
        return this.browserService.getDriver().findElement(By.xpath(String.format(selectProjectTypeRadioBttnLocator, value)));
    }

}
