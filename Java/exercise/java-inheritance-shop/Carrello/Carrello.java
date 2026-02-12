import java.util.Scanner;

import Cuffie.Cuffie;
import Prodotto.Prodotto;
import Smartphone.Smartphone;
import Televisori.Televisori;

public class Carrello {

    /*Create una classe Carrello con metodo main, in cui chiedete all’utente di valorizzare un carrello di prodotti
    con dati inseriti tramite scanner.
    Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo uno Smarphone o un Televisore o Cuffie
    e in base alla scelta dell’utente utilizzate il costruttore opportuno.
Al termine dell’inserimento stampate il carrello (fate l’override del metodo toString per restituire le informazioni
da stampare per ogni classe) */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Prodotto T1 = new Televisori(12345, "Samsung", 1499.99, 22, 55, true);
        Prodotto s1 = new Smartphone("IDE34567", 256);
        Prodotto c1 = new Cuffie(1234576, "Razer Kraken", 159.99, 22, "Nero/Viola", false, true);


        System.out.println("\n Che prodotto vuoi inserire nel carrello?");
        System.out.println("Scegliere : \n" +
                " - 1 : Televisore; \n - 2 : Smartphone; \n - 3 : Cuffie;");

        int scelta = scan.nextInt();

        if(scelta == 1 ){
            System.out.println(T1);
        }else if(scelta == 2){
            System.out.println(s1);
        }else if(scelta == 3){
            System.out.println(c1);
        }else {
            System.out.println("Scelta non valida.");
        }

    }
}