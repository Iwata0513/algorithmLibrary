package trial.sort;

public enum SortType {
    BUBBLE("バブル"),
    INSERTION("挿入")
    ;

    private final String sortName;

    private SortType(final String sortName) {
        this.sortName = sortName;
    }

    public String getSortName() {
        return this.sortName;
    }
	
}
