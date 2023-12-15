package main.bean;

public class Cart {
    private String cartId;
    private String customerId;
    private String goodId;

    public String getCartId() {
        return cartId;
    }

    public Cart setCartId(String cartId) {
        this.cartId = cartId;
        return this;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Cart setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getGoodId() {
        return goodId;
    }

    public Cart setGoodId(String goodId) {
        this.goodId = goodId;
        return this;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartId='" + cartId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", goodId='" + goodId + '\'' +
                '}';
    }
}
