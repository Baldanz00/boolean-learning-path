import RipassoGenerics.ClassiAstratteEInterfacceEsercizio.astratta.Auto;
import RipassoGenerics.ClassiAstratteEInterfacceEsercizio.interfacce.ConTraino;

public class UtilityCar extends Auto implements ConTraino {

    private int velocitaMassima;
    private int numeroPorte;

    public UtilityCar(String nome, int velocitaMassima, int numeroPorte) {
        super(nome);
        this.velocitaMassima = velocitaMassima;
        this.numeroPorte = numeroPorte;
    }

    @Override
    public void stampaVelocitàMassima() {
        System.out.println("La velocità massima è: " + velocitaMassima);
    }

    @Override
    public void stampaNumeroPorte() {
        System.out.println("Il numero porte è: " + numeroPorte);
    }

    @Override
    public void trainaAuto() {
        System.out.println("Sto trainando un auto.");
    }

    @Override
    public void trainaAuto(Auto auto) {
        System.out.println("Sto trainando un auto " + auto.getNome());

    }
}