public class Snacks11 {

    public static void main(String[] args) {

        /*Piramide vuota con bordi di asterischi
Con n = 5:
      *
   *   *
  *      *
 *         *
********* */
        int n = 5;
        stampaPiramide(n);

    }

    public static void stampaPiramide(int n){

        for (int i = 1; i <= n; i++) {
            //stampa spazi
            for (int j = 1; j <= n - i; j++) { // j<= n - 1 per appiccicarla al bordo
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if( i== n || k == 1 || k == 2 * i -1){
                    System.out.print("*");
                } else { System.out.print(" ");}
            }
            System.out.println();
        }
    }
}