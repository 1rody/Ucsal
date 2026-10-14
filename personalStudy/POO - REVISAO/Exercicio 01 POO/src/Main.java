import entities.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Notebook", "Notebook gamer", 10, 4500.00);

        System.out.println("=== PRODUTO ===");
        System.out.println("Nome: " + product.getName());
        System.out.println("Descricao: " + product.getDescription());
        System.out.println("Quantidade: " + product.getQuantity());
        System.out.println("Preco: R$ " + product.getPrice());
        System.out.println("Valor total em estoque: R$ " + product.calcValueStock());

        System.out.println("\n=== ADICIONAR QUANTIDADE ===");
        System.out.println(product.addQuantity(5));
        System.out.println("Quantidade atual: " + product.getQuantity());

        System.out.println("\n=== REMOVER QUANTIDADE ===");
        System.out.println(product.removeQuantity(3));
        System.out.println("Quantidade atual: " + product.getQuantity());

        System.out.println("\n=== TESTAR ERROS ===");
        System.out.println(product.addQuantity(-2));
        System.out.println(product.removeQuantity(20));

        System.out.println("\n=== VALOR FINAL EM ESTOQUE ===");
        System.out.println("Quantidade: " + product.getQuantity());
        System.out.println("Valor total: R$ " + product.calcValueStock());
    }
}