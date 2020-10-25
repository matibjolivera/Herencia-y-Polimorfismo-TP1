package Ejercicio3;

import java.util.Scanner;

/**
 * The type Test.
 */
public class Test {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Seller seller = new Seller();

        addProducts(seller);

        seller.showProducts();
        int position;

        Sale sale = new Sale();
        do {
            System.out.println("Ingrese posición del producto (X) / (0 para finalizar): ");
            position = scanner.nextInt();

            if (position > 0) {
                Product product = seller.getProducts().get(position - 1);

                if (product != null) {
                    sale.addProduct(product);
                }
            }
        } while(position != 0);

        if (!sale.getProducts().isEmpty()) {
            sale.close();
        } else {
            System.out.println("No se seleccionaron productos.");
        }

        scanner.close();
    }

    private static void addProducts(Seller seller) {
        seller.addProduct(new Refrigerator("Whirlpool", "H2745", "01", 220, true, 14999, 250, true));
        seller.addProduct(new Television("Philips", "49PGFS", "02", 220, true, 14370, 49, true));
        seller.addProduct(new Laundry("Drean", "CONCEPT 5.05", "03", 220, true, 6799, 6, false));
    }
}
