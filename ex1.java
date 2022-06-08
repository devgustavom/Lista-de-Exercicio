

import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
    
    
        Scanner ler = new Scanner(System.in);
        float a,h,b,B;
        System.out.println("Digite a altura(h): ");
        h= ler.nextFloat();
        System.out.println("Digite a base menor(b): ");
        b= ler.nextInt();
        System.out.println("Digite a base maior(B): ");
        B= ler.nextInt();
        a = (h * (b + B)) / 2;

        System.out.println("A área do trapézio é: " + a);

    }





}