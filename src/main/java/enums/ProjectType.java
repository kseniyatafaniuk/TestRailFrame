package enums;

public enum ProjectType {
    SINGLE_FOR_ALL_CASES ("1"),
    SINGLE_WITH_BASELINE ("2"),
    MULTIPLE ("3");

    private final String value;

    ProjectType(String value) {
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

    public static ProjectType getEnumProjectTypeByValue(String value) throws Exception {
        for (ProjectType projectType : ProjectType.values()){
            if (projectType.getValue().equals(value))
                return projectType;
        }
        throw new Exception("No project type with such value: " + value);
    }
}
