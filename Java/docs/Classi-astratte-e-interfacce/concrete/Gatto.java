import astratte.Animale;

public class Gatto extends Animale{

    @Override
    public void faiVerso(){
        System.out.println("Miaoooooo");
    }

    @Override
    public void getCibo(){
        System.out.println("Onnivoro");
    }

    @Override
    public void cammina(){
        System.out.println("Cammino in modo silenzioso");
    }
}