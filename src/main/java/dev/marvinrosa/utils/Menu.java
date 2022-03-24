package dev.marvinrosa.utils;

import dev.marvinrosa.model.Customer;
import dev.marvinrosa.model.Restaurant;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Restaurant restaurant;

    public void addCustomer(){
        String name, email;
        System.out.print("Write your name: ");
        name = scanner.nextLine();
        System.out.print("Write your email: ");
        email = scanner.nextLine();

    }
}
