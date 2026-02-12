public class Cerchio extends Figura {
    public static final double PI_GRECO = 3.14;
    private double raggio;
    public Cerchio(double raggio) {
        this.raggio = raggio;
    }
    @Override
    public double calcolaArea() {
        return PI_GRECO * raggio * raggio;
    }
}