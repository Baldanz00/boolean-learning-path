public class Triangolo implements Poligono {

    private double lato;

    public Triangolo(double lato) {
        this.lato = lato;
    }

    @Override
    public double calcolaPerimetro() {
        return 3 * lato;
    }

    @Override
    public double calcolaArea() {
        return (Math.sqrt(3)/4)*(lato * lato);
    }

    @Override
    public String toString() {
        return "Triangolo [lato=" + lato + ", perimetro=" + calcolaPerimetro() + ", area=" + calcolaArea() + "]";
    }

}