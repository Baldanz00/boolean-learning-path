import java.util.Scanner;

public class Snacks02 {

    public static void main(String[] args) {

        /*L’utente inserisce due parole in successione.
        Il software stampa prima la parola più corta, poi la parola più lunga */

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci la prima parola: ");
        String parola1 = scan.nextLine();
        System.out.println("Inserisci la seconda parola");
        String parola2 = scan.nextLine();

        if(parola1.length() > parola2.length()){
            System.out.println("La prima parola inserita, " + parola1 + " ,è più lunga della seconda parola inserita, " + parola2);
        } else if(parola2.length() > parola1.length()){
            System.out.println("La seconda parola inserita, " + parola2 + " ,è più lunga della prima parola inserita, " + parola1);
        }else{
            System.out.println("Le due parole, " + parola1 + " e " + parola2 + " sono lunghe uguali");
        }
    }
}