package steps;

import baseEntitites.BaseStep;
import core.BrowserService;
import models.Project;
import org.openqa.selenium.JavascriptExecutor;
import pages.AdminProjectsPage;

public class AdminProjectsPageSteps extends BaseStep<AdminProjectsPage> {

    public AdminProjectsPageSteps(BrowserService browserService) {
        super(browserService);
    }

    @Override
    public BaseStep<AdminProjectsPage> openPage() {
        this.page.open();
        return this;
    }

    public AddEditProjectPageSteps openAddProjectPage() {
        this.page.getAddProjectButton().click();
        return new AddEditProjectPageSteps(this.browserService);
    }

    public AddEditProjectPageSteps openEditProjectPage(Project project) {
        this.page.getEditProjectLink(project.getName()).click();
        return new AddEditProjectPageSteps(this.browserService);
    }

    public DeleteProjectDialogueSteps openDeleteProjectDialogue(Project project) {
        this.page.getDeleteButtonByProjectName(project.getName()).click();
        return new DeleteProjectDialogueSteps(this.browserService);
    }

}
