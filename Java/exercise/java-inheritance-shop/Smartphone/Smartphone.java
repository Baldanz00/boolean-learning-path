import Prodotto.Prodotto;

public class Smartphone extends Prodotto{
    /*- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria */
    private String IMEI;
    private int memoriaGB;
    public Smartphone(String iMEI, int memoriaGB) {
        super("Smartphone", 23432, "Apple" , 1299.99, 22);
        IMEI = iMEI;
        this.memoriaGB = memoriaGB;
    }
    public String getIMEI() {
        return IMEI;
    }
    public int getMemoriaGB() {
        return memoriaGB;
    }

    @Override
    public String toString() {
        return super.toString() + "IMEI: " + IMEI + ", memoria GB: " + memoriaGB;

    }


}