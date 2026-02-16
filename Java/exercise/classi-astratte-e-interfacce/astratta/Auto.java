public abstract class Auto {

    private String nome;
    public Auto(String nome){
        this.nome = nome;
    }

    public String getNome() { return nome; }

    public abstract void stampaVelocitàMassima();
    public abstract void stampaNumeroPorte();
    public  void accenditi(){
        System.out.println("Ciao David!!");
    }
    public  void spegniti(){
        System.out.println("Arrivederci!!");
    }


}