public class ex5 {

    public static void main(String[] args) {
        
    

        Integer a;
        Integer b;

        for (a = 2; a <= 123; a++) {
            Boolean primo = true;

            for (b = 2; b < a; b++) {

                if (a % b == 0) {
                    primo = false;
                }
            }

            if (primo == true) {
                System.out.println(a + " É primo");
            }

            else if (primo == false) {
                System.out.println(a + " Não é primo");
            }

        }

    }

}
