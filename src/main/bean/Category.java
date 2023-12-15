package main.bean;

public class Category {
    private String categoryId;
    private String categoryName;
    private String upId;

    public String getCategoryId() {
        return categoryId;
    }

    public Category setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public Category setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    public String getUpId() {
        return upId;
    }

    public Category setUpId(String upId) {
        this.upId = upId;
        return this;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId='" + categoryId + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", upId='" + upId + '\'' +
                '}';
    }
}
