import poligono.Poligono;

public class TriangoloRettangolo extends Poligono {

    private int cateto1;
    private int cateto2;
    private int ipotenusa;

    public TriangoloRettangolo(int cateto1, int cateto2, int ipotenusa){
        super(3);
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        this.ipotenusa = ipotenusa;
    }


    private int calcolaArea(){
        return cateto1*cateto2/2;
    }

    private  int calcolaPerimetro(){
        return cateto1 + cateto2 + ipotenusa;
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