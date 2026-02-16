public class Aquila extends Animal implements Movimento{

    @Override
    public void faiVolare(){ System.out.println("Sto Volando!!"); }

    @Override
    public void faiNuotare(){}

    @Override
    public void faiCamminare(){}

    @Override
    public void faiVerso(){
        System.out.println("Verso dell'Aquila.");
    }

    @Override
    public void mangia(){
        System.out.println("L'aquila mangia le prede più piccole, dai piccoli animali agli insetti");
    }
}