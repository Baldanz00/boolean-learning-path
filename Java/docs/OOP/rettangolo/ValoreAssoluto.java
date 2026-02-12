public class ValoreAssoluto {

    /*Qual è il senso del alore assoluto? Dato un valore, io ti restituisco sempre un valore positivo. */
    private double valore;

    //costruttore
    public  ValoreAssoluto(double valore){
        if(valore < 0){ //tu mi dai un dato negativo
            valore *=-1; // io te lo passo a positivo
        }
        this.valore = valore; //ti restituisco il valore
    }

    public double getValore(){
        return valore;
    }
}