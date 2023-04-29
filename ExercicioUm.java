import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota = -1;

        while (nota < 0 || nota > 10) {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Tente novamente.");
            }
        }

        System.out.println("Nota digitada: " + nota);
    }
}
