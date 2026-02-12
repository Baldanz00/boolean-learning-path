public class Auto extends Veicolo {
    private int numeroPorte;
    public Auto(String marca, int anno, int numeroPorte) {
        super(marca, anno);
        this.numeroPorte = numeroPorte;
    }
    public int getNumeroPorte() {
        return numeroPorte;
    }
    public void setNumeroPorte(int numeroPorte) {
        this.numeroPorte = numeroPorte;
    }
    @Override
    public void stampaInfo() {
        super.stampaInfo();
        System.out.println("Numero porte: " + numeroPorte);
    }
}