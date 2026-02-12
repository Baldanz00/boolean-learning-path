public class Main {

    public static void main(String[] args) {
        Prodotto p1 = new Prodotto("Computer");
        Prodotto p2 = new Prodotto("Cuffie");
        Prodotto p3 = new Prodotto("Tastiera");


        System.out.println("Numero di prodotti creati : " + Prodotto.getNumeroProdottiCreati());
        p1.infoProdotto();
        p2.infoProdotto();
        p3.infoProdotto();
    }

}