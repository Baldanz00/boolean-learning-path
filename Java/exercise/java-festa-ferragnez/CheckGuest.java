import java.util.Scanner;

public class CheckGuest {

    /* - creare ed inizializzare array con i nomi degli invitati;
     *  - chiedere il nome dell'utente
     *  - verificare che sia presente nella lista
     *  - stampa rispettivi messaggi se c'è o no*/

    public String [] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-AX",
            "Francesco Totti","Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei",
            "Martina Maccherone", "Rachel Zeilic"};

    public String name;

    void main() {

        System.out.println("Benvenuto, questa è la festa Ferragnez. Verifichiamo se sei stato invitato.");

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome per verificare se sei invitato alla festa:");
        String name = scan.nextLine();

        for(String invitato : invitati){
            // System.out.println("----ENTRA NEL FOR----");
            if(invitato.equals(name)){ //essendo una stringa si usa il .equals(obj) e no l'== perchè confronterebbe solo il riferimento alla cella di memoria
                System.out.println("Sei tra gli invitati, benvenuto alla festa!");
                return; //esco subito dal ciclo , non ho bisogno di ciclarlo tutto. Appena ho trovato il mio nome posso ignorare il resto
            }
        }
        System.out.println("Mi dispiace non sei tra gli invitati della festa Ferragnez.");


        /* ⚙️BONUS: applicare la stessa logica ma con ciclo WHILE :
         *
         * boolean isInvited = false;
         * int i = 0;
         *
         * while(i < invitati.lenght){
         *   if(invitati[i].equals(name){
         *       isInvited = true;
         *       breack;
         *       }
         *   i++;
         * }
         *
         * if(isInvited){
         *   System.out.println("Benvenuto alla festa, sei tra gli invitati");
         * } else { System.out.println("Non sei tra gli invitati"); }
         *  */
    }
}