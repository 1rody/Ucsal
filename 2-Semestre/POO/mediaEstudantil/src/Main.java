import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao registro de notas dos estudantes.");

        student student = new student();

        System.out.println("Registro de estudante.");

        System.out.println("Nome do aluno:");
        student.setName(sc.next());

        System.out.println("Nota inicial do aluno " + student.getName());
        student.setScoreFirst(sc.nextFloat());

        System.out.println("Nota secundaria do aluno ");
        student.setScoreSecond(sc.nextFloat());

        System.out.println("Nota terciaria do aluno ");
        student.setScoreTertiary(sc.nextFloat());

        System.out.println("A media total do estudante foi de...");

        student.calcMedia();

        System.out.println("A media finao de " + student.getName() + " Foi de " + student.getFinalScore() + ", ");
        student.Approved();


    }
}