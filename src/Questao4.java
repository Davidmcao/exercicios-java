import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        int hora;

        Scanner ler = new Scanner(System.in);

    System.out.println("Informe a hora: ");
    hora = ler.nextInt();

    if(hora < 24 && hora > 9 && hora < 18){
         System.out.println("Está no horario comercial");
   }else{
    System.out.println("Está fora do horario comercial");
   }
  }
}
