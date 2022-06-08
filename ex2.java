import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Double A = 0.0, h = 0.0, b = 0.0, B = 0.0;

        System.out.println("Digite a altura do trapézio");
        h = ler.nextDouble();

        System.out.println("Digite o valor da base menor");
        b = ler.nextDouble();

        System.out.println("Digite a base maior");
        B = ler.nextDouble();

        A = (h * (b + B)) / 2;

        System.out.println("A Área do trapézio é igual " + A);
        System.out.println("O valor arredondado é igual a " + A.intValue());

    }

}
