import java.util.Scanner;



public class RettangoloAsterischi {

    public static void main(String[] args) {

        /*Dato un numero di righe e un numero di colonne stampare un rettangolo pieno
         di asterischi
          Esempio: Con righe = 4 e colonne = 6
            Output:
            ******
            ******
            ******
            ****** */



        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci il numero dell'altezza del rettangolo");

        int altezza = scan.nextInt(); // Altezza del rettangolo

        System.out.println("Inserisci il numero della larghezza del rettangolo");
        int larghezza = scan.nextInt(); // Larghezza del rettangolo

        for (int i = 0; i < altezza; i++) { //itera per ogni riga del rettangolo.
            // "i" rappresenta il numero di riga corrente a partire da 0
            for (int j = 0; j < larghezza; j++) { //itera per ogni colonna all'interno di una riga
                System.out.print("*");
            }
            System.out.println();
        }
    }
}