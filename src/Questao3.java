
import java.util.Scanner;


public class Questao3 {
    public static void main(String[] args) {
        double salario, bonus;
        String des;
       
 
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o desempenho do funcionario: (Ótimo, Bom, Regular ou Ruim) ");
        des = ler.next();

        System.out.println("Informe o salario do funcionario: ");
        salario = ler.nextDouble();

        if(des.equals("Otimo")){
            bonus = salario + (salario * 0.20);
            System.out.println("O salario do funcionario após bonús é: " + bonus);
        }
        if(des.equals("Bom")){
            bonus = salario + (salario * 0.10);
            System.out.println("O salario do funcionario após bonús é: "+ bonus);
        }
        if (des.equals("Regular")) {
            bonus = salario + (salario * 0.05);
            System.out.println("O salario do funcionario após o bonís é: "+bonus);
        }
        if (des.equals("Ruim")){
            System.out.println("Não foi possivel adicionar bonus");
        }
    }
    
}
