import java.util.Scanner;

public class ex5_pag33 {

    public static void main(String[] args) {

        java.util.Scanner ler = new Scanner(System.in);
        Double salario, valorhora = 10.25;
        Integer hora;

        System.out.println(" Digite a quantidade de horas trabalhadas: ");
        hora = ler.nextInt();

        salario = valorhora * hora;

        System.out.println("O seu salário será igual a: R$" + salario);

        if (salario < 50) {

            System.out.println("Atenção, dirija-se à direção do Hotel!! ");
        }

    }

}