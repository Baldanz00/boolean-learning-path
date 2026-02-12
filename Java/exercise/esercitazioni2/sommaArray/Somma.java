/*Calcola la somma di tutti gli elementi di un array.
Esempio: int [] a = {1, 2, 3, 4, 5}
Output: 15 */

public class Somma {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int somma = 0;

        for (int i = 0; i < a.length; i++) {
            somma += a[i];
        }
        System.out.println("La somma degli elementi dell'array è : " + somma);
    }
}