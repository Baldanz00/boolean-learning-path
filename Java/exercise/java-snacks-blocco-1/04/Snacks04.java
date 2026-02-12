import java.util.Scanner;

public class Snacks04 {

    public static void main(String[] args) {

        /*n un array sono contenuti i nomi degli invitati alla festa del grande Gatsby,
        chiedi all’utente il suo nome e comunicagli se può partecipare o no alla festa. */

        Scanner scan = new Scanner(System.in);
        String[] invitati = {"Jay" , "Nick", "Daisy", "Tom", "Jordan"};

        System.out.println("Inserisci il tuo nome per vedere se sei nella lista invitati.");
        String nomeUtente = scan.nextLine();

        boolean presente = false;
        for (String nome : invitati) {
            if(nomeUtente.equals(nome)){
                presente = true;
                break;
            }
        }
        if(presente){
            System.out.println("Sei nella lista invitati della festa del sig. Gatsby");
        } else{
            System.out.println("Non sei nella lista invitati.");
        }

    }
}