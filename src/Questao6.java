
import java.util.Scanner;

public class Questao6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do CPF (somente os dígitos): ");
        String cpf = scanner.nextLine();

        scanner.close();

        if (cpf.length() == 11 && cpf.matches("\\d{11}")) {
            System.out.println("CPF válido");
        } else {
            System.out.println("CPF inválido");
        }
    }
}
