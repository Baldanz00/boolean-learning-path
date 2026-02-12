public class Elefante extends Animale{
    public Elefante(String nome){
        super(nome);
    }

    @Override
    public void faiVerso(){
        System.out.println(nome + ": Barriscee");
    }

}