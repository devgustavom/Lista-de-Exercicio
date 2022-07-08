import java.util.Scanner;

public class ex4_pag33 {

   public static void main(String[] args) {
    
   

        java.util.Scanner ler = new Scanner(System.in);
        Double salario, valorh = 10.25;
        Integer hora;

        System.out.println(" Digite a quantidade de horas trabalhadas: ");
        hora = ler.nextInt();

        salario = valorh * hora;

        System.out.println("O seu salário será igual a: R$" + salario);

    }

}
