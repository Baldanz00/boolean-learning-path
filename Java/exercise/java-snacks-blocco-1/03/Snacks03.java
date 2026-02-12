import java.util.Scanner;

public class Snacks03 {

    public static void main(String[] args) {

        /*Il software deve chiedere per 10 volte all’utente di inserire un numero.
        Il programma stampa la somma di tutti i numeri inseriti. */
        Scanner scan = new Scanner(System.in);

        int somma = 0;
        System.out.println("Inserisci 10 numeri in sequenza per calcolarne la somma: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Inserisci il numero " + i + " : ");
            somma += scan.nextInt();
        }
        System.out.println("La somma dei numeri inseriti è: " + somma);
    }
}