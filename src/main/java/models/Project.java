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

    public Project setName(String name) {
        this.name = name;
        return this;
    }

    public String getAnnouncement() {
        return announcement;
    }

    public Project setAnnouncement(String announcement) {
        this.announcement = announcement;
        return this;
    }

    public boolean isShowAnnouncement() {
        return isShowAnnouncement;
    }

    public Project setShowAnnouncement(boolean showAnnouncement) {
        this.isShowAnnouncement = showAnnouncement;
        return this;
    }

    public ProjectType getType() {
        return type;
    }

    public Project setType(ProjectType type) {
        this.type = type;
        return this;
    }
}
