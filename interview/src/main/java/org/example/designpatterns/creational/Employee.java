package org.example.designpatterns.creational;

public class Employee {
    private String name;
    private long phone;
    private String address;

    public Employee(String name, long phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public Employee setPhone(long phone) {
        this.phone = phone;
        return this;
    }

    public Employee setAddress(String address) {
        this.address = address;
        return this;
    }

    public Employee createEmployee() {
        return new Employee(name, phone, address);
    }
}
