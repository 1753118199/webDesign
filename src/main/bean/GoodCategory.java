package main.bean;

public class GoodCategory {
    private String goodId;
    private String customerId;
    private String goodName;
    private String description;
    private String price;
    private String category;
    private String categoryName;
    private String upCategoryName;

    public String getGoodId() {
        return goodId;
    }

    public GoodCategory setGoodId(String goodId) {
        this.goodId = goodId;
        return this;
    }

    public String getCustomerId() {
        return customerId;
    }

    public GoodCategory setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getGoodName() {
        return goodName;
    }

    public GoodCategory setGoodName(String goodName) {
        this.goodName = goodName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GoodCategory setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public GoodCategory setPrice(String price) {
        this.price = price;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public GoodCategory setCategory(String category) {
        this.category = category;
        return this;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public GoodCategory setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    public String getUpCategoryName() {
        return upCategoryName;
    }

    public GoodCategory setUpCategoryName(String upCategoryName) {
        this.upCategoryName = upCategoryName;
        return this;
    }

    @Override
    public String toString() {
        return "GoodCategory{" +
                "goodId='" + goodId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", goodName='" + goodName + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", category='" + category + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", upCategoryName='" + upCategoryName + '\'' +
                '}';
    }
}
