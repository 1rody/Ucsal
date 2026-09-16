
import model.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Estoque de produtos");
        System.out.println("Informe a operacao que voce deseja realizar (adicionar) (remover)");

        String operacao = sc.next().toLowerCase(Locale.ROOT);

        if (operacao.equals("adicionar")) {

            System.out.print("Nome do produto:");
            String name = sc.next();
            System.out.println(" ");

            System.out.print("Preco do produto:");
            double price = sc.nextDouble();
            System.out.println(" ");

            System.out.print("Quantidade:");
            int quantity = sc.nextInt();
            System.out.println(" ");

            Product product = new Product(name, price, quantity);
            System.out.print("Produtos disponiveis");
            System.out.println("");
            product.showProductInfo();

            System.out.println("Informe a operacao que voce deseja realizar (adicionar) (remover)");

            String operacaoSecundaria = sc.next().toLowerCase(Locale.ROOT);

            if (operacaoSecundaria.equals("retirar")) {
                System.out.print("Produtos disponiveis");
                System.out.println("");
                product.showProductInfo();

                System.out.println("Informe quantos produtos voce vai remover:");
                int removeQuantity = sc.nextInt();

                product.removeOnStock(removeQuantity);
            }


        }
        if (operacao.equals("retirar")) {
            System.out.print("Cadastre um produto antes.");
        }
    }
}