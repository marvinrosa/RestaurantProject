package dev.marvinrosa.utils;

import dev.marvinrosa.model.*;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Restaurant restaurant;
    Order order;
    Product product;

    public void inite(){
        int optionMenu = 0;
        int numbersOfPerson;
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Customer customer = new Customer("Juan","Perez");
        Order order = new Order(customer);

        Product product;

        System.out.println();
        sb.append("-- Welcome -- ")
                .append("\n1. Pizza $2.00")
                .append("\n2. Hamburger $4.00")
                .append("\n3. Tacos $4.00")
                .append("\n4. Chicken Fried $4.00")
                .append("\n5. Cesar Salad $4.00")
                .append("\n6. Chicken Special $4.00\n");
        System.out.println(sb.toString());
        System.out.print("How many dishes do you want? ");
        numbersOfPerson = scanner.nextInt();

        for (int i = 0; i < numbersOfPerson; i++) {
            product = new Product();
            System.out.println("Select a product: ");
            optionMenu = s.nextInt();
            if (optionMenu == 1) {
                product.setName("Pizza");
                System.out.println("Added a Pizza");
                product.setPrice(2);

            }
            if (optionMenu == 2) {
                product.setName("Hamburguer");
                System.out.println("Added a Hamburguer");
                product.setPrice(4);

            }
            if (optionMenu == 3) {
                product.setName("Tacos");
                System.out.println("Added a Tacos");
                product.setPrice(2);

            }
            if (optionMenu == 4) {
                product.setName("Chicken Fried");
                System.out.println("Added a Chicken");
                product.setPrice(2);

            }
            if (optionMenu == 5) {
                product.setName("Salad");
                System.out.println("Added a Salad");
                product.setPrice(3);

            }
            if (optionMenu == 6) {
                product.setName("Special Chicken ");
                System.out.println("Added a Special Chicken");
                product.setPrice(6);
            }

            System.out.print("How many Order do you want ? ");
            order.addItems(new OrderDetail(s.nextInt(), product));

            System.out.println();
            s.nextLine();
        }
        System.out.println(order);
    }


}
