package main.bean;

public class CategorySelect {
    private String categoryId;
    private String categoryName;
    private String upId;
    private String upName;

    public String getCategoryId() {
        return categoryId;
    }

    public CategorySelect setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public CategorySelect setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    public String getUpId() {
        return upId;
    }

    public CategorySelect setUpId(String upId) {
        this.upId = upId;
        return this;
    }

    public String getUpName() {
        return upName;
    }

    public CategorySelect setUpName(String upName) {
        this.upName = upName;
        return this;
    }

    @Override
    public String toString() {
        return "CategorySelect{" +
                "categoryId='" + categoryId + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", upId='" + upId + '\'' +
                ", upName='" + upName + '\'' +
                '}';
    }
}
