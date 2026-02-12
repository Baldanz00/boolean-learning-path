public class Veicolo {
    private String marca;
    private int anno;
    public Veicolo(String marca, int anno) {
        this.marca = marca;
        this.anno = anno;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getAnno() {
        return anno;
    }
    public void setAnno(int anno) {
        this.anno = anno;
    }
    public void stampaInfo() {
        System.out.println("Marca: " + marca + ", Anno: " + anno);
    }
}