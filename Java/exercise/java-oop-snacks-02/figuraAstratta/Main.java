public class Main {
    public static void main(String[] args) {
        Cerchio c = new Cerchio(5);
        Rettangolo r = new Rettangolo(4, 6);
        System.out.println("Area cerchio: " + c.calcolaArea());
        System.out.println("Area rettangolo: " + r.calcolaArea());
    }
}
