import astratte.Animale;
import interfacce.Camminante;

public class Vacca extends Animale implements Camminante{

    //non compila finchè non implementa i metodi

    @Override
    public void faiVerso(){
        System.out.println("Muuuuuuu");
    }

    @Override
    public void getCibo(){
        System.out.println("Erbivoro");
    }

    @Override
    public void cammina(){
        System.out.println("Cammino");
    }




}