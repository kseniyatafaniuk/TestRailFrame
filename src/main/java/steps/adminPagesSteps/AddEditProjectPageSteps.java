package steps.adminPagesSteps;

import baseEntitites.BaseStep;
import core.BrowserService;
import models.Project;
import pages.adminPages.AddEditProjectPage;

public class AddEditProjectPageSteps extends BaseStep<AddEditProjectPage> {

    public AddEditProjectPageSteps(BrowserService browserService) {
        super(browserService);
    }

    @Override
    public AddEditProjectPageSteps openPage() {
        this.page.open();
        return this;
    }

    public AdminProjectsPageSteps addProject(Project project) {

        this.page.getNameInput().sendKeys(project.getName());
        this.page.getAnnouncementInput().sendKeys(project.getAnnouncement());

        if (project.isShowAnnouncement()) {
            this.page.getIsAnnouncementShownCheckbox().click();
        }

        this.page.getSelectProjectTypeRadioBttn(project.getType().getValue()).click();

        this.page.getAddButton().click();

        return new AdminProjectsPageSteps(this.browserService);
    }

    public AdminProjectsPageSteps editProject(Project project) {

        this.page.getNameInput().clear();
        this.page.getNameInput().sendKeys(project.getName());
        this.page.getAnnouncementInput().clear();
        this.page.getAnnouncementInput().sendKeys(project.getAnnouncement());
        this.page.getSelectProjectTypeRadioBttn(project.getType().getValue()).click();
        this.page.getIsAnnouncementShownCheckbox().click();
        this.page.getAddButton().click();

        return new AdminProjectsPageSteps(this.browserService);
    }

    public DeleteProjectDialogueSteps deleteProject() {
        return new DeleteProjectDialogueSteps(this.browserService);
    }
}
