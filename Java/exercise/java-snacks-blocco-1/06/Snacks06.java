import java.util.Scanner;

public class Snacks06 {
    public static void main(String[] args) {

        /*Stampa il cubo dei primi N numeri,
    dove N è un numero indicato dall’utente. */

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci di quanti numeri vuoi sapere il cubo.");
        int numero = scan.nextInt();

        for (int i = 0; i <= numero; i++) {
            int cubo = i*i*i;
            System.out.println("Il cubo di " + i + " è: " + cubo);
        }
    }

}