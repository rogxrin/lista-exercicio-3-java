import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, senha;

        do {
            System.out.print("Digite seu nome de usuário: ");
            nome = scanner.nextLine();

            System.out.print("Digite sua senha: ");
            senha = scanner.nextLine();

            if (senha.equals(nome)) {
                System.out.println("Erro: O nome de usuário e a senha nao podem ser iguais. Tente novamente.");
            }
        } while (senha.equals(nome));

        System.out.println("login feito com sucesso!");
    }
}
