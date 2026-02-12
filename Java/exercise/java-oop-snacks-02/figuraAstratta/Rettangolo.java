public class Rettangolo extends Figura {
    private double base;
    private double altezza;
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public double calcolaArea() {
        return base * altezza;
    }
    public final void stampaTipo() {
        System.out.println("Sono un rettangolo.");
    }
}