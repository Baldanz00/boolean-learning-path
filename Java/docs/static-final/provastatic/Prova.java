import utility.Utility;

public class Prova {

    private String nome;
    private String descrizione;
    private static String scopo;


    public Prova() {
        Utility.increment();
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    public static String getScopo() {
        return scopo;
    }
    public static void setScopo(String scopo) {
        Prova.scopo = scopo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prova{");
        sb.append("nome=").append(nome);
        sb.append(", descrizione=").append(descrizione);
        sb.append(", scopo=").append(scopo);
        sb.append('}');
        return sb.toString();
    }


}