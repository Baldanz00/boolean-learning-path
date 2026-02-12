public class Serpente extends Animale{
    public Serpente(String nome){
        super(nome);
    }

    @Override
    public void faiVerso(){
        System.out.println(nome + ": SSSSSSSSSS");
    }
}