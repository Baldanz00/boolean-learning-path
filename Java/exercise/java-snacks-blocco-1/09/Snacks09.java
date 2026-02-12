public class Snacks09 {
    public static void main(String[] args) {

        /*Calcola la somma e la media dei primi 10 numeri */
        int somma = 0;
        for (int i = 0; i <=10; i++) {
            somma+=i;

        }
        double media= somma / 10;
        System.out.println("La somma è: " + somma);
        System.out.println("La media è: " + media);
    }

}