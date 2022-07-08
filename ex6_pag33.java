import java.util.Scanner;

public class ex6_pag33 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

  

        Double libra, quilo, conversao = 0.45359237;
        String letra;

        System.out.println("Escolha a sua conversão: Q= libra para quilo // L= quilo para libra ");
        letra = ler.nextLine();

        if (letra.equalsIgnoreCase("Q")) {
            System.out.println("Digite o valor em libra para ser convertido em quilo: ");
            libra = ler.nextDouble();

            conversao = libra * 0.45359237;

            System.out.println("O valor convertido de libra para quilo é de: " + conversao);

        }

        else if (letra.equalsIgnoreCase("L")) {
            System.out.println("Digite o valor em quilo para ser convertido em libra: ");
            quilo = ler.nextDouble();

            conversao = quilo / 0.45359237;

            System.out.println("O valor convertido de qiolo para libra é de: " + conversao);

        }

        else {

            System.out.println("INVÁLIDO, escolha uma opção válida");

        }

    }
}