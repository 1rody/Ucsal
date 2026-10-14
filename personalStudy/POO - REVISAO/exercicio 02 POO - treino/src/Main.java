import entities.Product;
import services.Stock;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stock stock = new Stock();

        System.out.print("Product name: ");
        String name = sc.nextLine();

        System.out.print("Product description: ");
        String description = sc.nextLine();

        System.out.print("Product quantity: ");
        Integer quantity = sc.nextInt();

        System.out.print("Product price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        Product product = new Product(name, description, quantity, price);
        stock.addProduct(product);

        System.out.print("Product name: ");
        name = sc.nextLine();

        System.out.print("Product description: ");
        description = sc.nextLine();

        System.out.print("Product quantity: ");
        quantity = sc.nextInt();

        System.out.print("Product price: ");
        price = sc.nextDouble();
        sc.nextLine();

        product = new Product(name, description, quantity, price);
        stock.addProduct(product);

        System.out.println("\nTotal stock value: R$ " + stock.calcTotalStockValue());

        Product mostExpensive = stock.mostExpensiveProduct();
        if (mostExpensive != null) {
            System.out.println("Most expensive product: " + mostExpensive);
        }

        System.out.print("\nSearch product: ");
        name = sc.nextLine();

        Product found = stock.findProduct(name);
        System.out.println(found != null ? found : "Product not found.");

        System.out.print("\nRemove product: ");
        name = sc.nextLine();
        stock.removeProduct(name);

        System.out.println("Total stock value after removal: R$ " + stock.calcTotalStockValue());

    }
}