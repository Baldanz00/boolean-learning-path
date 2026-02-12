public class MissioneCommerciale extends MissioneSpaziale {
    private String aziendaPartner;
    public MissioneCommerciale(String nomeMissione, String aziendaPartner) {
        super(nomeMissione);
        this.aziendaPartner = aziendaPartner;
    }
    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.println("Partner: " + aziendaPartner);
    }
}