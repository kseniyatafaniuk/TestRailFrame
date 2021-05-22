import core.BrowserService;
import enums.ProjectType;
import models.Project;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Factory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.adminPages.AdminProjectsPage;
import steps.adminPagesSteps.AdminProjectsPageSteps;
import steps.LoginPageSteps;
import testData.StaticProvider;
import utils.Utils;

public class ProjectTests {

    private BrowserService browserService;
    private AdminProjectsPage adminProjectsPage;
    private AdminProjectsPageSteps adminProjectsPageSteps;
    private Project project;

    @BeforeClass
    @Parameters({"validEmail", "validPassword"})
    public void loggingWithCorrectCreds(String email, String password) {
        browserService = new BrowserService();
        adminProjectsPage = new LoginPageSteps(browserService)
                .openPage()
                .loginWithCorrectCreds(email, password)
                .openAdminPage()
                .openAdminProjectsPage()
                .getPageInstance();
    }

    @Factory(dataProvider = "Create Projects", dataProviderClass = StaticProvider.class)
    public ProjectTests(Project project) {
        this.project = project;
    }

    @Test
    public void createProjectTest() {

        adminProjectsPage = new AdminProjectsPageSteps(this.browserService)
                .openAddProjectPage()
                .addProject(this.project)
                .getPageInstance();

        Assert.assertTrue(this.adminProjectsPage
                .getSuccessMessage().isDisplayed());
        Assert.assertNotNull(this.adminProjectsPage
                .getProjectInTheListByName(this.project.getName()));
    }

    @Test(dependsOnMethods = "createProjectTest")
    public void editProjectTest() {

        int projectTypeIndex = Utils.getRandomNumber(0, ProjectType.values().length);
        Project editedProject = new Project(
                this.project.getName() + "_edited",
                this.project.getAnnouncement() + "_edited",
                true,
                ProjectType.values()[projectTypeIndex]
        );

        this.adminProjectsPage = new AdminProjectsPageSteps(this.browserService)
                .openEditProjectPage(this.project)
                .editProject(editedProject)
                .getPageInstance();

        this.project = editedProject;

        Assert.assertTrue(this.adminProjectsPage
                .getSuccessMessage().isDisplayed());
        Assert.assertEquals(this.adminProjectsPage
                .getSuccessMessage().getText(), "Successfully updated the project.");

    }

    @Test(dependsOnMethods = "editProjectTest")
    public void deleteProjectTest() {

        this.adminProjectsPage = new AdminProjectsPageSteps(this.browserService)
                .openDeleteProjectDialogue(this.project)
                .checkConfirmationCheckbox()
                .okButtonClick()
                .getPageInstance();

        Assert.assertEquals(this.adminProjectsPage
                .getSuccessMessage().getText(), "Successfully deleted the project.");

        Assert.assertNull(this.adminProjectsPage.
                getProjectInTheListByName(this.project.getName()));
    }


}
