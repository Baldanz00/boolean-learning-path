public class Prodotto {
    /*Crea una classe Prodotto con i seguenti attributi:
nome (String, private)
codiceProdotto (int, private)
contatoreProdotti (int, private e static)
L'attributo contatoreProdotti deve tenere traccia di quanti oggetti Prodotto sono stati creati.
Nel costruttore della classe Prodotto, incrementa contatoreProdotti di 1 e assegna il suo nuovo valore a codiceProdotto.
In questo modo, ogni prodotto avrà un codice univoco e progressivo (1, 2, 3...).
Aggiungi un metodo pubblico e statico getNumeroProdottiCreati() che restituisca il valore di contatoreProdotti.
Aggiungi un metodo infoProdotto() che stampi nome e codice del prodotto.
Nel Main, crea tre o quattro istanze di Prodotto. Dopo averle create, chiama il metodo statico
Prodotto.getNumeroProdottiCreati() per verificare che il conteggio sia corretto. Infine, chiama infoProdotto() su
ciascun oggetto per vedere i loro codici univoci. */

    private String nome;
    private int codiceProdotto;
    private static int contatoreProdotti=0;

    public Prodotto(String nome) {
        this.nome = nome;
        contatoreProdotti++;
        this.codiceProdotto=contatoreProdotti;
    }
    public static int getNumeroProdottiCreati(){
        return contatoreProdotti;
    }
    public void infoProdotto(){
        System.out.println("Prodotto " + nome + ", codice prodotto: " + codiceProdotto);
    }

}