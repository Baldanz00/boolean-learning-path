
public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5, 10);
        Quadrato quadrato = new Quadrato(4);

        System.out.println("Area del rettangolo: " + rettangolo.calcola());
        System.out.println("Area del quadrato: " + quadrato.calcola());
    }

}