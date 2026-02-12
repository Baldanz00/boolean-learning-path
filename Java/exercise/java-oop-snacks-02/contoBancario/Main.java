public class Main {
    public static void main(String[] args) {
        ContoRisparmio conto = new ContoRisparmio("12345", 1000, 0.05);
        conto.applicaInteressi();
        conto.preleva(200);
        System.out.println("Saldo finale: " + conto.getSaldo());
    }
}