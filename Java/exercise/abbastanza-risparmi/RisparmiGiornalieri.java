/*Scrivete un programma che vi aiuti a calcolare, dato l'ammontare di quanto avete messo da parte ogni giorno, quanti giorni dovete aspettare prima di poter acquistare una cosa che desiderate.

Il programma riceve nel flusso di ingresso il numero intero positivo corrispondente al costo dell'oggetto che volete acquistare, seguito da una successione (eventualmente vuota e terminata dal numero 0) di numeri interi positivi, corrispondenti ciascuno a quanto avete risparmiato in un giorno.

Il programma deve emettere nel flusso di uscita il minimo numero di giorni dopo cui potete effettuare l'acquisto, oppure 0 se non avete risparmiato abbastanza.

Ad esempio, se il flusso di ingresso contiene

10 1 1 3 4 6 9 0
il programma emette 5, infatti i risparmi complessivamente accumulati nei sei giorni sono

1 2 5 9 15 24
e il primo giorno in cui il totale è pari, o superiore, a 10 è il quinto giorno*/

/*devo leggere il costo dell'oggetto -- Scanner
 * devo leggere i risparmi giornalieri e sommarli giorno per igorno
 * Vedere quando raggiungo la somma che mi interessa, devo stampare quel giorno
 * Se non raggiungo quel costo devo stampare 0*/

import java.util.Scanner;

public class RisparmiGiornalieri {

    void main(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci il costo del prodotto:");
        int costoOggetto = scan.nextInt();
        int sommaGiorni = 0;
        int giorni = 0;
        boolean obiettivoRaggiunto = false;

        System.out.println("Inserisci i risparmi giornalieri");
        while(true){
            System.out.println("Giorno "+ (giorni + 1) + " : ");
            int risparmi = scan.nextInt();

            if(risparmi == 0){
                break;
            }
            giorni++; //incremento i giorni
            sommaGiorni += risparmi;  //aggiungo i risparmi giornalieri

            //verifico se  ho raggiunto il mio costoOggetto
            if(!obiettivoRaggiunto && sommaGiorni >= costoOggetto){
                System.out.println("Puoi acquistare l'oggetto dopo " + giorni + " giorni");
                obiettivoRaggiunto = true;
                break;
            }
        }
        //se non ho raggiunto il costoOggetto, stampiamo 0
        if(!obiettivoRaggiunto){
            System.out.print("Non hai raggiunto l'obiettivo. ");
        }
        scan.close();
    }
}