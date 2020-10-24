package Ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * The type Seller.
 */
public class Seller {

    private ArrayList<Product> products;

    /**
     * Instantiates a new Seller.
     */
    public Seller() {
        this.products = new ArrayList<Product>();
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

    public void addProduct(Product product) {
        this.getProducts().add(product);
    }

    public void showProducts() {
    	int j;
        for (int i = 0; i < this.getProducts().size(); i++) {
        	j = i;
            System.out.println(++j + ": " +  this.getProducts().get(i));
        }
    }

    private ArrayList<String> getProductsCodes() {
        return new ArrayList<>(
                Arrays.asList(Television.CODE, Laundry.CODE, Blender.CODE, Refrigerator.CODE)
        );
    }
}
