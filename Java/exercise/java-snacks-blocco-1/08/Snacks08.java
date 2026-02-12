import java.util.Scanner;

public class Snacks08 {
    public static void main(String[] args) {

        /*
        Chiedi un numero di 4 cifre all’utente
        e calcola la somma di tutte le cifre che compongono il numero. */

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci un numero di 4 cifre per poterne calcolare la somma.");
        int numeroUtente = scan.nextInt();
        int somma=0;

        for (int i = numeroUtente; i <=9999 && i >= 1000; i++) {
            somma += numeroUtente % 10;
            numeroUtente /=10;

        }
        System.out.println(somma);

    }

}