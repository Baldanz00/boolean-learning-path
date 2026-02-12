import java.util.Scanner;

public class Snacks01 {

    public static void main(String[] args) {

        /*L’utente inserisce due numeri in successione.
        Il software stampa il maggiore.
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci il primo numero: ");
        int numero1 = scan.nextInt();
        System.out.println("Inserisci il secondo numero: ");
        int numero2 = scan.nextInt();

        if(numero1 > numero2){
            System.out.println("Il primo numero inserito " + numero1 + " è maggiore del secondo numero inserito " + numero2);
        } else if(numero2 > numero1){
            System.out.println("Il secondo numero inserito " + numero2 + " è maggiore del primo numero inserito " + numero1);
        }else{
            System.out.println("I due numeri sono uguali");
        }

    }

}