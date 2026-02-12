
/*Stampa gli elementi dell’array in ordine inverso.
Esempio: int [] a = {1, 2, 3, 4, 5}
Output: 5, 4, 3, 2, 1 */

public class InvertiArray {

    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5};

        System.out.println("L'array in ordine è : ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
        System.out.println("L'array invertito è : ");

        for (int i = a.length -1 ; i >= 0; i--) {
            System.out.println(a[i] + " ");

        }
    }
}