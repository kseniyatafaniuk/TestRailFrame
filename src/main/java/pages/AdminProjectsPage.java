package pages;

import core.BrowserService;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AdminProjectsPage extends AdminSidebarPage {

    private static final By successMessageBy = By.cssSelector(".message.message-success");
    private static final By projectsNameLinkBy = By.xpath("//tbody/descendant::a[normalize-space()]");
    private static final String projectRowLocator = "//a[text()='%s']/ancestor::tr";
    private static final By deleteProjectButtonBy = By.className("icon-small-delete");
    private static final By openProjectLinkBy = By.className("icon-small-openswindow");
    private static final String editProjectLinkLocator = "//a[text()='%s']";
    private static final By addProjectButtonBy = By.xpath("//a[contains(@href, 'index.php?/admin/projects/add')]");

    public AdminProjectsPage(BrowserService browserService) {
        super(browserService, "/admin/projects/overview");
    }

    public WebElement getProjectInTheListByName(String projectName) {
        try {
            return this.browserService.getDriver().findElement(By.xpath(String.format(projectRowLocator, projectName))).findElement(projectsNameLinkBy);
        } catch (NoSuchElementException ex) {
            return null;
        }
    }

    public WebElement getDeleteButtonByProjectName(String name) {
        WebElement projectRow = this.browserService.getDriver().findElement(By.xpath(String.format(projectRowLocator, name)));
        return projectRow.findElement(deleteProjectButtonBy);
    }

    public WebElement getOpenProjectLink(String name) {
        WebElement projectRow = this.browserService.getDriver().findElement(By.xpath(String.format(projectRowLocator, name)));
        return projectRow.findElement(openProjectLinkBy);
    }

    public WebElement getEditProjectLink(String name) {
        return this.browserService.getDriver().findElement(By.xpath(String.format(editProjectLinkLocator, name)));
    }

    public WebElement getSuccessMessage() {
        return this.browserService.getDriver().findElement(successMessageBy);
    }

    public List<WebElement> getProjectsNameLinks() {
        return this.browserService.getDriver().findElements(projectsNameLinkBy);
    }

    public WebElement getAddProjectButton() {
        return this.browserService.getDriver().findElement(addProjectButtonBy);
    }
}
