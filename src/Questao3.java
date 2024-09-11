import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        int salario, bonus;
        String desempenho;

        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o valor da pontuação do funcionário: (0-100)");
        desempenho = ler.next();

        if(desempenho == "Ótimo" des|| "ou"){
            System.out.println("Insatisfatório");
        }
        if( > 25 && pontuacao <= 50){
            System.out.println("Regular");
        }
        if(pontuacao > 50 &&  pontuacao <= 75){
           System.out.println("Bom");
        }
        if(pontuacao > 75 && pontuacao <= 100){
            System.out.println("Ótimo");
        }
        if(pontuacao > 100){
            System.out.println("Número incorreto, tente novamente");
        } 
    }
    
}
