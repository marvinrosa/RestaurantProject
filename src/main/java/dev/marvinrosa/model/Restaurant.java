package dev.marvinrosa.model;

public class Restaurant {

    private String name;
    private int id;
    private static int location;
    Customer customer;
    Order order;

    public Restaurant(Customer customer) {
        this.name ="Restaurant";
        this.id = ++location;
        this.customer = customer;
    }

    public Restaurant(Customer customer,Order order) {
        this.name ="Restaurant";
        this.id = ++location;
        this.order = order;
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
