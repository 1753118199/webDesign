package main.bean;

public class CartSelect {
    private String cartId;
    private String customerId;
    private String goodId;
    private String goodName;
    private String description;
    private String price;
    private String category;

    public String getCartId() {
        return cartId;
    }

    public CartSelect setCartId(String cartId) {
        this.cartId = cartId;
        return this;
    }

    public String getCustomerId() {
        return customerId;
    }

    public CartSelect setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getGoodId() {
        return goodId;
    }

    public CartSelect setGoodId(String goodId) {
        this.goodId = goodId;
        return this;
    }

    public String getGoodName() {
        return goodName;
    }

    public CartSelect setGoodName(String goodName) {
        this.goodName = goodName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CartSelect setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public CartSelect setPrice(String price) {
        this.price = price;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public CartSelect setCategory(String category) {
        this.category = category;
        return this;
    }

    @Override
    public String toString() {
        return "CartSelect{" +
                "cartId='" + cartId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", goodId='" + goodId + '\'' +
                ", goodName='" + goodName + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
