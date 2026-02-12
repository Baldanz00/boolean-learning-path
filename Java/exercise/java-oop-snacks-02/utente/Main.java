public class Main {
    public static void main(String[] args) {
        new Utente("Alessandra");
        new Utente("Gioia");
        new Utente("Marco");
        System.out.println("Numero totale utenti: " + Utente.getNumeroUtenti());
    }
}