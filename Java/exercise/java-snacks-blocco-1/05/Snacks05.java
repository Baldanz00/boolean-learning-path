import java.util.Scanner;

public class Snacks05 {

    public static void main(String[] args) {

        /*Chiedi per 6 volte all’utente di inserire un numero,
        se è dispari mostrare questa informazione a video */

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci 6 numeri in sequenza:");
        for (int i = 1; i <= 6; i++) {
            System.out.println("Inserisci il numero " + i + ": ");
            int numeroUtente = scan.nextInt();
            if(numeroUtente % 2 != 0){
                System.out.println("Il numero scelto è dispari.");
            } else{
                System.out.println("Il numero scelto è pari.");
            }
        }
    }

}