public class Cane extends Animal implements Movimento{

    @Override
    public void faiVerso(){
        System.out.println("Verso del Cane");
    }

    @Override
    public void mangia(){
        System.out.println("Il cane mangia i croccantini");
    }

    @Override
    public void faiVolare(){}

    @Override
    public void faiNuotare(){  }

    @Override
    public void faiCamminare(){ System.out.println("Sto camminando!!");}
}