package main.bean;

public class Customer {
    private String customerId;
    private String customerName;
    private String password;
    private String customerPhone;
    private String customerDelete;

    public String getCustomerId() {
        return customerId;
    }

    public Customer setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Customer setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Customer setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public Customer setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
        return this;
    }

    public String getCustomerDelete() {
        return customerDelete;
    }

    public Customer setCustomerDelete(String customerDelete) {
        this.customerDelete = customerDelete;
        return this;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", password='" + password + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", customerDelete='" + customerDelete + '\'' +
                '}';
    }
}
