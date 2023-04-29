import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();

        int menor = num1;
        int maior = num2;
        if (num2 < num1) {
            menor = num2;
            maior = num1;
        }

        System.out.println("Números no intervalo de " + menor + " a " + maior + ":");
        for (int i = menor; i <= maior; i++) {
            System.out.print(i + " ");
        }
    }
}
