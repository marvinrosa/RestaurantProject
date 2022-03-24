package dev.marvinrosa;


import dev.marvinrosa.model.Customer;
import dev.marvinrosa.model.Order;
import dev.marvinrosa.model.OrderDetail;
import dev.marvinrosa.model.Product;
import dev.marvinrosa.ui.MainMenu;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {

        Customer customer = new Customer();
        customer.setName("Juan Perez");
        customer.setEmail("m@gm.com");

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese una descripción de la factura: ");
        String desc = s.nextLine();
        Order factura = new Order(desc, customer);

        Product product;
        System.out.println();


        for(int i = 0; i<2; i++){
            product = new Product();
            System.out.print("Ingrese producto nº " + product.getId() + ": ");
            product.setName(s.nextLine());

            System.out.print("Ingrese el precio: ");
            product.setPrice(s.nextFloat());

            System.out.print("Ingrese la cantidad: ");
            factura.addItems(new OrderDetail(s.nextInt(), product));

            System.out.println();
            s.nextLine();
        }
        System.out.println(factura);
    }
}
