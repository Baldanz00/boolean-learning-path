import RipassoGenerics.ClassiAstratteEInterfacceEsercizio.astratta.Auto;
import RipassoGenerics.ClassiAstratteEInterfacceEsercizio.interfacce.ConTurbo;

public class SportCar extends Auto implements ConTurbo {

    private int velocitaMassima;
    private int numeroPorte;

    public SportCar(String nome, int velocitaMassima, int numeroPorte) {
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
        System.out.println("Il numero delle porte è: " + numeroPorte);
    }

    @Override
    public void attivaIlTurbo() {
        System.out.println("Ho attivato il turbo!!");
    }
}