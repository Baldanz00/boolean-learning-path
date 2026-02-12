/*Trova il valore minimo all’interno di un array.
Esempio: int [] a = {1, 2, 3, 4, 5}
Output: 1 */
public class TrovaMinimo {

    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5};
        int TrovaMinimo = a[0];

        for (int i = 0; i <a.length; i++) {
            if(a[i] < TrovaMinimo){
                TrovaMinimo = a[i];
            }

        }
        System.out.println("Il valore minimo all'interno dell'array è : " + TrovaMinimo);
    }
}