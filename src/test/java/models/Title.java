package models;

public enum Title {

    MR("Mr"),
    MS("Ms");

    private String title;

    Title(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
