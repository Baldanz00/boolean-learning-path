public class Studente {
    private String nome;
    private String cognome;
    private Corso corso;
    private int matricola;

    public Studente(String nome, String cognome, Corso corso, int matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.corso = corso;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public Corso getCorso() {
        return corso;
    }

    public int getMatricola() {
        return matricola;
    }

    @Override
    public String toString() {
        return "Studente: " + nome + " " + cognome + ", Corso: " + corso;
    }

}