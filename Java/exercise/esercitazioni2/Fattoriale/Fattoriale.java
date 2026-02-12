import java.util.Scanner;

/*Chiedere all'utente un numero n e calcola il suo fattoriale.
Esempio: n = 5
Output: 5x4x3x2x1 = 120
 */
public class Fattoriale {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero per calclarne il fattoriale: ");
        int num = scan.nextInt();

        //per poterne calcolare il fattoriale, il numero scelto dall'utente deve essere
        //positivo.
        if(num < 0){
            System.out.println("Il numero inserito deve essere maggiore di 0.");
        }else {
            long fattoriale = 1;
            for (int i = 1; i <= num; i++) {
                fattoriale += i ;
            }
            System.out.println("Il fattoriale di " + num + " è : " + fattoriale);
        }
    }


}