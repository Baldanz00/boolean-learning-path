public class Utility {

    static int conteggio = 0;

    /* Cosa succede se faccio un costruttore privato? Non puoi istanziare la classe.
     *
     */
    private Utility(){

    }
    //il costruttore vuoto e privato ha il solo scopo di far capire che non ci sono istanze ma che ci sono solo
    //metodi di utilità

    public static void increment(){
        conteggio++;
    }

    public static void leggiConteggio(){
        System.out.println(conteggio);
    }
}