public class Snacks07 {

    public static void main(String[] args) {

        /*Stampa le potenze di 2 fino a 1000 */

        int potenza = 2;
        for (int i = potenza; i <= 1000; i++) {
            System.out.println(potenza);
            potenza *=2;
            if(potenza>1000){
                break;
            }
        }
    }
}