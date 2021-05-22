package models;

import enums.ProjectType;
import utils.Utils;

public class Project {
    private String name;
    private String announcement;
    private boolean isShowAnnouncement;
    private ProjectType type;

    public Project(String name, String announcement, boolean isShowAnnouncement, ProjectType type) {
        this.name = name;
        this.announcement = announcement;
        this.isShowAnnouncement = isShowAnnouncement;
        this.type = type;
    }

    public static Project getDefault() {
        return new Project(
                Utils.getGeneratedName("KTafaniuk"),
                "Announcement Text",
                true,
                ProjectType.SINGLE_FOR_ALL_CASES);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }

    public boolean isShowAnnouncement() {
        return isShowAnnouncement;
    }

    public void setShowAnnouncement(boolean showAnnouncement) {
        isShowAnnouncement = showAnnouncement;
    }

    public ProjectType getType() {
        return type;
    }

    public void setType(ProjectType type) {
        this.type = type;
    }
}
