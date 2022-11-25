package org.example;

public class Address {
    private String state;
    private String city;
    private int pincode;

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", pincode=" + pincode +
                '}';
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;

    }
}
