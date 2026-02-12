/*Trova il valore massimo all'interno di un array di interi.
Esempio: int [] a = {1, 2, 3, 4, 5}
Output: 5 */
public class TrovaMassimo {

    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5};
        int TrovaMassimo = a[0];

        for (int i = 0 ; i < a.length; i++){
            if(a[i] > TrovaMassimo){
                TrovaMassimo = a[i];
            }
        }
        System.out.println("Il numero massimo all'interno dell'array è : " + TrovaMassimo);
    }
}