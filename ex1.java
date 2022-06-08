

import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
    
    
        Scanner ler = new Scanner(System.in);
        double A,h,b,B;
       
        System.out.println("Digite a altura do trapézio");
        h = ler.nextDouble();

        System.out.println("Digite o valor da base menor");
        b = ler.nextDouble();

        System.out.println("Digite a base maior");
        B = ler.nextDouble();

        A = (h * (b + B)) / 2;
        
        System.out.println("A Área do trapézio é igual " + A);

    }





}
