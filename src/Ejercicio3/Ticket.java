package Ejercicio3;

import java.util.ArrayList;

/**
 * The type Ticket.
 */
public class Ticket {

    private ArrayList<Product> products;

    /**
     * Instantiates a new Ticket.
     *
     * @param products the products
     */
    public Ticket(ArrayList<Product> products) {
        this.products = products;
    }

    /**
     * Gets products.
     *
     * @return the products
     */
    public ArrayList<Product> getProducts() {
        return products;
    }

    /**
     * Sets products.
     *
     * @param products the products
     */
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    /**
     * Print.
     */
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
