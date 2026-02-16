public class Delfino extends Animal implements Movimento{

    @Override
    public void faiVerso(){
        System.out.println("Verso del Delfino");
    }

    @Override
    public void mangia(){
        System.out.println("Il delfino mangia i pesci piccoli");
    }

    @Override
    public void faiVolare(){}

    @Override
    public void faiNuotare(){ System.out.println("Sto nuotando!!"); }

    @Override
    public void faiCamminare(){}
}