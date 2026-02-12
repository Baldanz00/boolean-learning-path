public class Main {
    public static void main(String[] args) {
        Poligono triangolo = new Triangolo(5);
        Poligono rettangolo = new Rettangolo(4, 6);

        System.out.println(triangolo);
        System.out.println("Perimetro del triangolo: " + triangolo.calcolaPerimetro());
        System.out.println("Area del triangolo: " + triangolo.calcolaArea());
        System.out.println(rettangolo);
        System.out.println("Perimetro del rettangolo: " + rettangolo.calcolaPerimetro());
        System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());
    }

}