
import model.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("ID da conta: ");
        int id = sc.nextInt();

        System.out.print("Saldo inicial: ");
        double balance = sc.nextDouble();

        Account account = new Account(name, id, balance);

        account.accountData();

        System.out.println("Deseja realizar alguma operacao? " + account.getAccountOnwer());
        System.out.print("Digite a operacao  ");

        String operation = sc.next().toLowerCase();

        if (operation.equals("saque")) {
            System.out.println("Digite o valor que deseja retirar  ");
            double minus = sc.nextDouble();
            account.saque(minus);
            System.out.println("Total de:  " + account.getAccountBalance() + " R$ restantes na conta.");
        }
        if (operation.equals("deposito")) {
            System.out.println("Digite o valor que deseja adicionar  ");
            double depositAdd = sc.nextDouble();
            account.deposit(depositAdd);
            System.out.println("Saldo atual:  " + account.getAccountBalance() + " R$");
        } else {
            System.out.println("Operacao invalida tente digitar algo como 'saque' ou 'deposito' " );
        }


    }
}