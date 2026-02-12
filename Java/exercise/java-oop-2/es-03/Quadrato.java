public class Quadrato {

    private int lato;

    public Quadrato(int lato) {
        this.lato = lato;
    }

    @Override
    public int calcola() {
        return lato * lato;
    }
}