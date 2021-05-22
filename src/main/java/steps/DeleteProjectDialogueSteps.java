package steps;

import baseEntitites.BaseStep;
import core.BrowserService;
import pages.AdminProjectsPage;
import pages.dialogues.DeleteProjectDialogue;

public class DeleteProjectDialogueSteps extends BaseStep<DeleteProjectDialogue> {

    public DeleteProjectDialogueSteps(BrowserService browserService) {
        super(browserService);
    }

    @Override
    public DeleteProjectDialogueSteps openPage() { //применимо ли для диалога?
        this.page.open();
        return this;
    }

    public DeleteProjectDialogueSteps checkConfirmationCheckbox(){
        this.page.getConfirmationCheckbox().click();
        return this;
    }

    public AdminProjectsPageSteps okButtonClick(){
        this.page.getOkButton().click();
        return new AdminProjectsPageSteps(this.browserService);
    }

}
