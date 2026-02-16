public class ContoBancario {

    /* Crea una classe ContoBancario con attributi per numero di conto e saldo.
    Implementa un costruttore che accetta il numero di conto e inizializza il saldo a zero.
    Aggiungi metodi pubblici per depositare denaro sul conto, prelevare denaro dal conto e
    ottenere il saldo corrente.
    */

    public String IBAN;

    public double balance;

    public ContoBancario(String IBAN) {
        this.IBAN = IBAN;
        balance = 0;
    }

    public void deposit (double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Importo depositato. Saldo attuale: " + balance + " €");
        } else {
            System.out.println("Non è possibile depositare un importo inferiore di 0.");
        }
    }

    public void withdrawal (double amount){
        if(amount > balance){
            System.out.println("Non è possibile prelevare. Fondi insufficienti.");
        } else if (amount <= 0){
            System.out.println("Non è possibile prelevare un importo uguale o inferiore a 0");
        } else {
            balance -= amount;
            System.out.println("Importo prelevato " + amount + "\n Saldo attuale: " + balance);
        }
    }
}

void main() {

    Scanner scan = new Scanner(System.in);
    ContoBancario conto1 = new ContoBancario("IT1234798753G");
    System.out.println("Inserisci l'importo da depositare sul conto");
    double importo = scan.nextDouble();
    conto1.deposit(importo);

    System.out.println("Inserisci l'importo da prelevare dal conto.");
    double importoDaPrelevare = scan.nextDouble();
    conto1.withdrawal(importoDaPrelevare);

    scan.close();
}