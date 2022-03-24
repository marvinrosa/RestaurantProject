package dev.marvinrosa.model;

public class Customer {

    private static int countId;
    private int id;
    private String name;
    private String email;
    private Boolean isActive;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.id = ++countId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
