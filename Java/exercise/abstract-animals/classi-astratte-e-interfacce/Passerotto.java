public class Passerotto extends Animal implements Movimento{

    @Override
    public void faiVerso(){
        System.out.println("Verso del Passerotto");
    }

    @Override
    public void mangia(){
        System.out.println("Il passerotto mangia i piccoli insetti");
    }

    @Override
    public void faiVolare(){ System.out.println("Sto volando!");}

    @Override
    public void faiNuotare(){  }

    @Override
    public void faiCamminare(){}
}