import java.math.BigDecimal;
import java.math.RoundingMode;

public class UsaCalcoliHeper {


    public static void main(String[] args) {
        int somma = CalcoliHelper.somma(5, 10);
        double prodotto = CalcoliHelper.moltiplicazione(5.5, 10.10);

        System.out.println("Somma " + somma + " prodotto " + prodotto);

        double divisione = CalcoliHelper.divisione(1.2, 3.3);
        System.out.println("Divisione " + divisione);

        /* Se io metto 1.2 e 3.3 escono numero particolari, perchè il double , essendo un numero a virgola mobile,
         * dopo un po perde delle informazioni.... più aumenta il numero dopo la virgola, più l'errore può essere significativo
         * Come evito questi errori nei calcoli?
         * BigDecimal -> oggetto java pensato per lavorare a oggetti
         *
         * |_ vuole un valore di inizio, che si passano a stringa e lui li converte da solo
         */
        BigDecimal dividendo = new BigDecimal("1.21");
        BigDecimal dividendo1 = new BigDecimal("1.21");

        BigDecimal divisore = new BigDecimal("3.32");

        /* BigDecimal è un oggetto non modificabile, ogni operazione restituisce una nuova istanta di BD */
        System.out.println(dividendo.add(divisore));

        /* Ha bisogno di sapere quale sistema di arrotondamento usare */
        System.out.println("Divisione: " + dividendo.divide(divisore, 4, RoundingMode.HALF_UP));
        //come si comparano 2 BigDecimal?
        System.out.println(dividendo.equals(dividendo1));//true
        //Compareto
        System.out.println(dividendo.compareTo(dividendo1));//va fatto custom --> ha lo scopo di determinare quale
        //oggetto è più grande tra i 2. se esce 1, il primo è più grande, se viene 0 sono uguali, se viene un numero negativo
        //il secondo è più grande

        //Come si fanno gli equals custom App:36
    }
}