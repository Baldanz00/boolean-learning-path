
/* Dato un numero n stampare un albero di asterischi crescente:
Esempio: n = 5
Output:
*
**
***
****
*****
 */


public class PiramideAsterischi {

    public static void main(String[] args) {
        int n = 5;
        stampaPiramide(n);
    }

    public static void stampaPiramide(int n) {
        for (int i = 1; i <= n; i++) { //il ciclo for esterno mi itera il numero di righe = altezza

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