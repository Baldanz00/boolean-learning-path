public class Corso {
    private String nomeCorso;
    private int codice;

    public Corso(String nomeCorso, int codiceCorso) {
        this.nomeCorso = nomeCorso;
        this.codice = codiceCorso;
    }
    public String getNomeCorso() {
        return nomeCorso;
    }
    public int getCodiceCorso() {
        return codice;
    }
    public void iscriviti(Studente studente) {
        // iscrivere lo studente al corso
        System.out.println(studente.getNome() + " " + studente.getCognome() + " si è iscritto al corso " + nomeCorso);
    }

}