import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int qtdPares = 0;
        int qtdImpares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");
            int num = input.nextInt();

            if (num % 2 == 0) {
                qtdPares++;
            } else {
                qtdImpares++;
            }
        }

        System.out.println("Quantidade de números pares: " + qtdPares);
        System.out.println("Quantidade de números ímpares: " + qtdImpares);
    }
}
