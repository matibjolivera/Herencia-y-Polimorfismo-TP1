package Ejercicio3;

import java.util.ArrayList;

public class Ticket {

    private ArrayList<Product> products;

    public Ticket(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void print() {
        System.out.println("Ticket:");
        double total = 0;
        for (Product product: this.getProducts()) {
            System.out.println(product.toString());
            total += product.getPrice();
        }
        System.out.println("Total: $" + total);
    }
}
