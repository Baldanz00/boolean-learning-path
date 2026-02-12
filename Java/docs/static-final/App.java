import java.util.Scanner;
import provaStatic.Prova;
import utility.Utility;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        /*ad esempio lo scanner, se io mettessi un null come parametro, Java non compila
         * perchè non saprebbe cosa vuoi o cosa darti. Tu hai l'obbligo di scegliere tra i parametri consentiti.
         */

        Prova p1 = new Prova();
        p1.setDescrizione("descrizione prova");
        p1.setNome("Prova");
        //p1.setScopo("Scopo prova"); //era giallo perchè il metodo è statico e non si riferisce all'istanza p1, ma alla classe
        Prova.setScopo("scopo prova");//sto invocando il metodo direttamente sulla classe...
        System.out.println(p1);

        Prova p2 = new Prova();
        p2.setDescrizione("descrizione prova 2");
        p2.setNome("nome prova 2");
        //p2.setScopo("scopo prova 2");
        Prova.setScopo("scopo prova 2");
        System.out.println(p2);

        //che succede se ristampo p1?
        System.out.println(p1);//lo scopo rimane di p2....
        /*gli altri li abbiamo definiti non statici, mentre scopo è statico.
         * Nome e Descrizione avranno uno scop di istanza(variabili di istanza = cambiando l'istanza , cambia il valore)...
         * Scopo, che è static, non fa riferimento all'istanza, ma all'intera classe... motivo per cui ce n'è una sola
         * versione in tutto il programma.
         */
        Utility.increment();
        Utility.leggiConteggio(); //posso richiamare questi metodi

        //--> Equals Custom
        Prova prova1 = new Prova();
        Prova prova2 = new Prova();
        System.out.println(prova1.equals(prova2));//false
        prova2 = prova1; //---> sto dicendo che prova2 punta alla stessa cella di memoria di prova1
        System.out.println(prova1.equals(prova2));//true
    }
}