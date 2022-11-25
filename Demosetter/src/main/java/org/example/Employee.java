package org.example;



public class Employee {
    private String name;
    private String empid;
    private Address address;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empid='" + empid + '\'' +
                ", address=" + address +
                '}';
    }

    public void setAddress(Address address) {
        this.address = address;

    }
}
