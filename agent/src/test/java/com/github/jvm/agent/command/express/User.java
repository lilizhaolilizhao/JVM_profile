package com.github.jvm.agent.command.express;

public class User {
    Address address;

    public User(String name, String test2) {
        this.name = name;
        this.test2 = test2;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private String name;
    private String test2;
}
