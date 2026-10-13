import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Moeda moeda = new Moeda();

        System.out.println("CONVERSOR:");
        System.out.println("Informe o valor que o sr. gostaria de converter e qual a moeda.");

        System.out.println("Informe o nome da moeda:");
        moeda.setNome(sc.nextLine());

        System.out.println("Informe quanto vale essa moeda em comparacao com o real:");
        moeda.setValor(sc.nextFloat());

        System.out.println("Informe quanto voce quer comprar de " + moeda.getNome() + ":");
        moeda.setBuyValue(sc.nextFloat());

        System.out.println("O Valor que voce via retirrar em USD: ");
        moeda.calcMoeda();

        sc.close();
    }
}