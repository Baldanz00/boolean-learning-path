public class Snacks10 {

    public static void main(String[] args) {

        /*Alberello di Natale (piramide centrata)
Stampa (con n = 5 righe):
    *
   ***
  *****
 *******
********* */
        int n = 5;
        stampaPiramide(n);
    }

    public static void stampaPiramide(int n){
        for (int i = 1; i <= n; i++) { //-> altezza della piramide

            // Stampa gli spazi
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Stampa gli asterischi
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}