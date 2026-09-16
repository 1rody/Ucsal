import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== LOJA DA FORD CARROS ===");
        System.out.println("Deseja ver nossa lista de veiculos ou deseja cadastrar um veiculo?");

        boolean register;
        String check;

        System.out.println("Digite sim se deseja cadastrar, se deseja visualizar a lista digite visualizar.");
        check = sc.next();

        if (check.matches("cadastrar") || check.matches("Cadastrar")) {
            System.out.println("Otimo. Insira os dados do seu veiculo no formulario de registro abaixo.");

            Car car = new Car();

            System.out.println("==REGISTRO DE VEICULO==");

            System.out.print("Marca: ");
            car.setBrandName(sc.next());

            System.out.print("Modelo: ");
            car.setModel(sc.next());

            System.out.print("Ano de lancamento: ");
            car.setYearOfLaunch(sc.nextInt());

            System.out.print("Esse carro e NOVO? ");
            car.setIsNew(sc.next());

            System.out.print("Preco de venda para a FORD: ");
            car.setBuyPrice(sc.nextDouble());

            System.out.print("Preco de re-venda: ");
            car.setSellPrice(sc.nextDouble());


            car.informations();

            System.out.print("OTIMO. CARRO REGISTRADO ");


        }
        else {
            System.out.println("Por em quanto estamos sem veiculos.");



        }

    }
}