public class App {
    public static void main(String[] args) throws Exception {
        Rettangolo r1 = new Rettangolo(10,20);
        System.out.println(r1.calcolaArea());

        //non è un codice robusto perchè non ha controlli sui valori... potrei...
        //r1.altezza = 0; //che è un errore.
        //ora che ho cambiato il modificatore e non sono più nella stessa classe, non posso modificarlo
        System.out.println(r1.calcolaArea()); //viene 0...

        //abbiamo manomesso dall'esterno il funzionamento dell'oggetto...
       /* In questo caso l'oggetto non si è comportato come un mondo a se, è stato troppo "aperto"
       verso il mondo esterno... e così facendo abbiamo potuto manometterlo. */


        //test valore assoluto
        System.out.println("Testiamo il valore assoluto: ");
        ValoreAssoluto v1 = new ValoreAssoluto(-10);
        ValoreAssoluto v2 = new ValoreAssoluto(0);
        ValoreAssoluto v3 = new ValoreAssoluto(5);

        System.out.println(String.format("v1: %f, v2: %f, v3: %f", v1.getValore(),
                v2.getValore(),v3.getValore()));
    }
}