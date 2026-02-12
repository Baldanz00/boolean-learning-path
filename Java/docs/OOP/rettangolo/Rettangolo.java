public class Rettangolo {

    private int base;
    private int altezza;

    //costruttore
    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    //metodo calcola Area
    public int calcolaArea(){
        return base * altezza;
    }

    //cosa dire di questa classe, quale può essere il suo scopo?
    /*Calcolare l'area conoscendo base e altezza. */

    public int calcolaPerimetro(){
        return base * 2 + altezza * 2;
    }

    //i due metodi possono essere public perchè espongono solo un calcolo

    //se devo fare un metodo che ha delle logiche interne per i calcoli, metto private.

    //GETTERS : non voglio che i valori siano cambiati, ma solo letti

    public int getBase(){
        return this.base;
    }
    public int getAltezza(){
        return this.altezza;
    }

    /* Qual è il senso dei getters? Restituisce il valore il LETTURA. Questo metodo non ritorna il riferimento
    all'oggetto, ma ritorna il valore, ma non posso modificarlo.
    INCAPSULAMENTO: ho incapsulato i valori dei dati in lettora, con un metodo.*/

    /*SETTERS: permetto l'acceso in modifica dei dati, e quindi mi punta alla cella di memoria di quell'elemento */

    // public int setBase(int base){
    //     return this.base;
    // }
    // public int setAltezza(int altezza){
    //     return this.altezza;
    // }

    /*In questo modo sto rompendo l'incapsulamento perchè permetto la scrittura. */

    //SETTER CUSTOM per impostare controlli: poi però nel costruttore devo mettere "setBase(base)"; e setAltezza(altezza);
    public void setBase(int base) {
        if(base <= 0){
            System.out.println("Valore errato, imposto un defoult");
            this.base = 10;
        } else {
            this.base = base;
        }
    }
    public void setAltezza(int altezza){
        if(altezza <= 0){
            System.out.println("Valore errato imposto un defooult");
            this.altezza = 20;
        } else {
            this.altezza = altezza;
        }
    }

    /*DOMANDA: FATTO UN COSTRUTTORE CONTROLLATO, SE CI METTIAMO I GETTER E ISETTER?
    Il get, why not, mi permette di leggere quel dato, se necessario lo mostriamo. Per quanto riguarda il set dipende,
    se è un dato che non deve essere cambiato, come il numero di un conto, un codice fiscale, o comunque dati che
    io decido non debbano essere cambiati, allora non lo mettiamo. */

}