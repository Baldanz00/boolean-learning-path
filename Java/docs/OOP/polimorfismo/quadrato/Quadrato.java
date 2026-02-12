import poligono.Poligono;

public class Quadrato extends Poligono {
    private int lato;

    public Quadrato(int lato) {
        super(4);
        this.lato = lato;
    }

    private  int calcolaArea(){
        return lato * lato;
    }

    private int calcolaPerimetro(){
        return lato * 4;
    }

    @Override
    public int getArea(){
        return calcolaArea();
    }

    @Override
    public int getPerimetro(){
        return calcolaPerimetro();
    }
}