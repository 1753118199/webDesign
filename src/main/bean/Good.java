package main.bean;

public class Good {
    private String goodId;
    private String customerId;
    private String goodName;
    private String description;
    private String price;
    private String category;
    private String goodDelete;

    public String getGoodDelete() {
        return goodDelete;
    }

    public void setGoodDelete(String goodDelete) {
        this.goodDelete = goodDelete;
    }

    public String getGoodId() {
        return goodId;
    }

    public Good setGoodId(String goodId) {
        this.goodId = goodId;
        return this;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Good setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getGoodName() {
        return goodName;
    }

    public Good setGoodName(String goodName) {
        this.goodName = goodName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Good setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public Good setPrice(String price) {
        this.price = price;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public Good setCategory(String category) {
        this.category = category;
        return this;
    }

    @Override
    public String toString() {
        return "Good{" +
                "goodId='" + goodId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", goodName='" + goodName + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
