import Prodotto.Prodotto;
import java.lang.classfile.Superclass;
import javax.lang.model.SourceVersion;

public class Televisori extends Prodotto{

    /*- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no */

    private int dimensioniPollici;
    private boolean smart;
    public Televisori(int codice, String marca, double prezzo, double iva, int dimensioniPollici, boolean smart) {
        super("Televisore", 235675,"Samsung", 1499.99, 22);
        this.dimensioniPollici = dimensioniPollici;
        this.smart = smart;

    }
    public int getDimensioniPollici() {
        return dimensioniPollici;
    }
    public boolean isSmart() {
        return smart;
    }

    @Override
    public String toString(){
        return super.toString() + " Dimensioni del " + getNome() + " in pollici: " + getDimensioniPollici() + ", la televisione è smart: " + isSmart();
    }


}