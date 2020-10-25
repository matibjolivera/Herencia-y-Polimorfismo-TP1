package Ejercicio3;

import java.util.ArrayList;

/**
 * The type Sale.
 */
public class Sale {

    private ArrayList<Product> products;

    /**
     * Instantiates a new Sale.
     *
     * @param products the products
     */
    public Sale() {
        this.products = new ArrayList<>();
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
     * Add product.
     *
     * @param product the product
     */
    public void addProduct(Product product) {
        this.getProducts().add(product);
    }

    /**
     * Close.
     */
    public void close() {
        Ticket ticket = new Ticket(this.getProducts());
        ticket.print();
    }
}
