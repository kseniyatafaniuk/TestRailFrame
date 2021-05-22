package testData;

import enums.ProjectType;
import models.Project;
import org.testng.annotations.DataProvider;
import utils.Utils;

public class StaticProvider {

    @DataProvider(name = "Create Projects")
    public static Object[][] createNewProjectsData() {
        return new Object[][]{
                {new Project(
                        Utils.getGeneratedName("KTafaniuk") + "_Single",
                        "Test Single for All Cases Project Definition",
                        true,
                        ProjectType.SINGLE_FOR_ALL_CASES
                )},
                {new Project(
                        Utils.getGeneratedName("KTafaniuk") + "_Baseline",
                        "Test Single With Baseline Project Definition",
                        false,
                        ProjectType.SINGLE_WITH_BASELINE
                )},
                {new Project(
                        Utils.getGeneratedName("KTafaniuk") + "_Multiple",
                        "Test Multiple Suits Project Definition",
                        true,
                        ProjectType.MULTIPLE
                )}
        };
    }
}
