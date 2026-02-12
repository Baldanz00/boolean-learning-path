public class ContoRisparmio extends ContoBancario {
    private double tassoInteresse;
    public ContoRisparmio(String numeroConto, double saldoIniziale, double tassoInteresse) {
        super(numeroConto, saldoIniziale);
        this.tassoInteresse = tassoInteresse;
    }
    public void applicaInteressi() {
        deposita(getSaldo() * tassoInteresse);
    }
}