
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        int valor, salario, parcelas, valorJuros;
        String emprestimo;
        boolean aprovado = false;

        Scanner ler = new Scanner(System.in);

        System.out.println("Voçê deseja realizar um emprestimo? ");
        emprestimo = ler.next();

        if ("Sim".equals(emprestimo)) {
            while (aprovado == false) {
                System.out.println("Qual o valor do emprestimo: ");
                valor = ler.nextInt();

                System.out.println("Em até quantas parcelas você deseja: ");
                parcelas = ler.nextInt();

                System.out.println("Informe seu salário: R$");
                salario = ler.nextInt();

                if (parcelas > salario * 0.30) {
                    valorJuros = valor / parcelas;
                    System.out.println("Seu emprestimo de " + valor + "foi aprovado");
                    System.out.println();
                    System.out.println("Você ira pagar " + parcelas + "X de " + valorJuros);
                    aprovado = true;
                } else {
                    System.out.println("Você não foi aprovado");
                    aprovado = true;
                }

            }
        }

    }

}
