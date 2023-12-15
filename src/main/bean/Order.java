package main.bean;

public class Order {
    private String orderId;
    private String address;
    private String buy_customer;
    private String sell_customer;
    private String total;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBuy_customer() {
        return buy_customer;
    }

    public void setBuy_customer(String buy_customer) {
        this.buy_customer = buy_customer;
    }

    public String getSell_customer() {
        return sell_customer;
    }

    public void setSell_customer(String sell_customer) {
        this.sell_customer = sell_customer;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", address='" + address + '\'' +
                ", buy_customer='" + buy_customer + '\'' +
                ", sell_customer='" + sell_customer + '\'' +
                ", total='" + total + '\'' +
                '}';
    }
}
