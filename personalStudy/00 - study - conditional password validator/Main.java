import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Descubra se sua senha e minimamente segura!");

        String password;

        boolean hasEspecial = false;

        boolean hasEight = false;

        boolean hasNumbers = false;

        int validator = 0;

        password = sc.next();

        while (validator < 1) {

            if (password.length() >= 8) {

                hasEight = true;

                if (password.contains("1") || password.contains("2")) {

                    hasNumbers = true;

                    validator++;;

                }

                if (password.contains("3") || password.contains("4")) {

                    validator++;;

                    hasNumbers = true;

                }

                if (password.contains("5") || password.contains("6")) {

                    hasNumbers = true;

                    validator++;;

                }

                if (password.contains("7") || password.contains("8")) {

                    hasNumbers = true;

                    validator++;

                }

                if (password.contains("9") || password.contains("0")) {

                    hasNumbers = true;

                    validator++;

                }

                if ((hasNumbers == true) && (hasEight == true)) {

                    if (password.contains("!") || password.contains("@")) {

                        hasEspecial = true;

                        validator++;

                    }

                    if (password.contains("#") || password.contains("$")) {

                        hasEspecial = true;

                        validator++;

                    }

                    if (password.contains("%") || password.contains("¨")) {

                        hasEspecial = true;

                        validator++;

                    }

                    if (password.contains("&") || password.contains("*")) {

                        hasEspecial = true;

                        validator++;

                    }

                    if (password.contains("(") || password.contains(")")) {

                        hasEspecial = true;

                        validator++;

                    }

                    if (password.contains("-") || password.contains("=")) {

                        hasEspecial = true;

                        validator++;

                    }

                    if (password.contains("{") || password.contains("}")) {

                        hasEspecial = true;

                        validator++;

                    }

                    if (password.contains("^") || password.contains("~")) {

                        hasEspecial = true;

                        validator++;

                    }

                } else {

                    System.out.println("Senha fraca!");

                    password = sc.next();

                }

            } else {

                System.out.println("Senha FRACA!");

                password = sc.next();

            }

            if ((hasEight == true) && (hasEspecial == true)) {

                System.out.print("Senha forte!");

            }
            if ((hasEight == true) || (hasEspecial == true) || (hasNumbers == true)) {

                System.out.print("Senha OK!");

            }

            if (((hasEight == true) && (hasEspecial == true)) && hasNumbers == true) {

                System.out.print("Senha MUITO FORTE!");

            }

        }

    }

}
