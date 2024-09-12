
import java.util.Random;
import java.util.Scanner;

public class Questao7 {

    public static void main(String[] args) {
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        int palpite = 0;

        while (palpite != numeroAleatorio) {
            System.out.print("Digite seu palpite (entre 1 e 100): ");
            palpite = scanner.nextInt();

            if (palpite < numeroAleatorio) {
                System.out.println("O número é maior que " + palpite);
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número é menor que " + palpite);
            } else {
                System.out.println("Parabéns! Você acertou o número!");
            }
        }

        scanner.close();
    }
}
