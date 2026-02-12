public class MissioneScientifica extends MissioneSpaziale {
    private String obiettivo;
    public MissioneScientifica(String nomeMissione, String obiettivo) {
        super(nomeMissione);
        this.obiettivo = obiettivo;
    }
    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.println("Obiettivo: " + obiettivo);
    }
}