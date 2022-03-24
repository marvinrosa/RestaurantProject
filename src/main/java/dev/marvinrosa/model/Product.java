package dev.marvinrosa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private float price;
    private static int lastId;

    public Product() {
        this.id = ++lastId;
    }

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
        this.id = ++lastId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id +
                "\t" + name +
                "\t\t\t" + price;
    }
}
