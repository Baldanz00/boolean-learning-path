public class Main {
    public static void main(String[] args) {
        Studente studente1 = new Studente("Mario", "Rossi", "Informatica", 45678);
        Corso corsoInformatica = new Corso("Informatica", 101);
    }
    corsoInformatica.iscrivi(studente1);

}