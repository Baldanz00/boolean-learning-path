public abstract class Animale {

    /* Crea una classe astratta Animale con un metodo astratto emettiVerso().
    La classe deve avere un attributo nome (String).
Crea tre classi che ereditano da Animale: Leone, Elefante, Serpente.
Implementa il metodo emettiVerso() in ciascuna sottoclasse in modo che stampi un verso appropriato
(es. "Roar!", "Barrisce!", "Sssss!").
Nella classe Main, crea un array (o una ArrayList) di tipo Animale.
Popola l'array con istanze delle diverse sottoclassi (Leone, Elefante, Serpente).
Scrivi un ciclo for che itera sull'array e chiama il metodo emettiVerso() su ogni animale.
Osserva come viene eseguito il metodo corretto per ogni oggetto, dimostrando il polimorfismo.*/

    protected String nome;
    public Animale(String nome){
        this.nome = nome;
    }

    public abstract void faiVerso();
}