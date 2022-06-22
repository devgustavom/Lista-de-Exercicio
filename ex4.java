public class ex4 {

    public static void main(String[] args) {
        
    
        int n1;
        int soma=0;
        long par=1;
        for(n1 = 0; n1<=30; n1++){
            
            if (n1 % 2 ==1){
                soma +=n1;

            }else{
                if (n1 > 0)
                par *= n1; 
            }
        }
        System.out.println("Soma dos ímpares: " + soma); 
        System.out.println("Multiplicação dos pares: " + par);       


    }
    
}
