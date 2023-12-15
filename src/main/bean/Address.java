package main.bean;

public class Address {
    private String addressId;
    private String customerId;
    private String address;

    public String getAddressId() {
        return addressId;
    }

    public Address setAddressId(String addressId) {
        this.addressId = addressId;
        return this;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Address setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Address setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId='" + addressId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
