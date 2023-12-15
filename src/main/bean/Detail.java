package main.bean;

public class Detail {
    private String detailId;
    private String orderId;
    private String goodId;
    private String goodName;
    private String description;
    private String amount;
    private String price;
    private String total;

    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "detailId='" + detailId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", goodId='" + goodId + '\'' +
                ", goodName='" + goodName + '\'' +
                ", description='" + description + '\'' +
                ", amount='" + amount + '\'' +
                ", price='" + price + '\'' +
                ", total='" + total + '\'' +
                '}';
    }
}
