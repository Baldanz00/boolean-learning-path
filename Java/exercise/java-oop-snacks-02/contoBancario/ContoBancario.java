public class ContoBancario {
    private double saldo;
    private String numeroConto;
    public ContoBancario(String numeroConto, double saldoIniziale) {
        this.numeroConto = numeroConto;
        this.saldo = saldoIniziale;
    }
    public void deposita(double importo) {
        saldo += importo;
    }
    public void preleva(double importo) {
        if (importo <= saldo) {
            saldo -= importo;
        } else {
            System.out.println("Fondi insufficienti.");
        }
    }
    public double getSaldo() {
        return saldo;
    }
}