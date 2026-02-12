import java.util.Scanner;

public class Tabellina {
    /*Chiedere all'utente di quale numero stampare la tabellina e fino a
     quale numero arrivare.
Esempio: numeroTabellina 5, numeroFineTabellina 10
Output: 0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Di quale numero vuoi stampare la tabellina?");

        int numeroTabellina = scan.nextInt();

        System.out.println("Fino a quale numero vuoi arrivare?");
        int numeroFineTabellina = scan.nextInt();

        for (int i = 1; i <= numeroFineTabellina; i++) {
            System.out.println(numeroTabellina + "x" + i + " = " + numeroFineTabellina);

        }


    }
}