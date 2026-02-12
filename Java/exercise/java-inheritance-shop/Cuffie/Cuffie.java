import Prodotto.Prodotto;

public class Cuffie extends Prodotto{

    /*- Cuffie, caratterizzate dal colore e se sono wireless o cablate */
    private String colore;
    private boolean wireless;
    private boolean cablate;
    public Cuffie(int codice, String marca, double prezzo, double iva, String colore, boolean wireless,
                  boolean cablate) {
        super("Cuffie", 45678912, "Razer Kraken", 159.99, 22);
        this.colore = colore;
        this.wireless = wireless;
        this.cablate = cablate;
    }
    public String getColore() {
        return colore;
    }
    public boolean isWireless() {
        return wireless;
    }
    public boolean isCablate() {
        return cablate;
    }

    @Override
    public String toString(){
        return super.toString() + "Le cuffie sono del colore: " + getColore() + ", sono wireless: " + isWireless() + ", sono cablate: " + isCablate();
    }

}