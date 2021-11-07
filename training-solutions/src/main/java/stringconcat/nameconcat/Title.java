package stringconcat.nameconcat;

public enum Title {
    MR("Mr."), MRS("Mrs."), MS("Ms."), DR("Dr.");

    private String titlevalue;

    Title(String titlevalue) {
        this.titlevalue = titlevalue;
    }

    public String getTitlevalue() {
        return titlevalue;
    }
}
