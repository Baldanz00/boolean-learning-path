public class Rettangolo {
    private int base;
    private int altezza;

    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public int calcola() {
        return base * altezza;
    }

}