public class MissioneSpaziale {
    private static int contatore = 0;
    private final int idMissione;
    private String nomeMissione;
    public MissioneSpaziale(String nomeMissione) {
        this.nomeMissione = nomeMissione;
        this.idMissione = ++contatore;
    }
    public void stampaDettagli() {
        System.out.println("Missione: " + nomeMissione + ", ID: " + idMissione);
    }
    public static int getNumeroMissioni() {
        return contatore;
    }
}