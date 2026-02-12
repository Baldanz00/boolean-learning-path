import interfacce.Camminante;

public abstract class Animale implements Camminante{

    public Animale(){}//costruttore
    public abstract void faiVerso();
    //se non sai di che animale stai parlano, non puoi sapere che verso fa. Per questo non puoi imolementare il metodo e lo
    // lasci fare alle sottoclassi.
    /* se una classe concreta eredita una classe astratta, deve per forza implementare i metodi astratti.
     * Se una classe astratta eredit una classe astratta no, perchè se li porta.
     */

    //  public void getCibo(){} //facendo un metodo vuoto, ha senso perchè non so i vari animali cosa mangiano e devono
    //implementarlo loro, però così facendo le classi secondarie non sono obligate a richiamare il metodo
    // e di conseguenza implementarlo, perchè sono costrette solo con i metodi astratti.

    public abstract void getCibo();

    public void dormi(){ //metodo concreto, ha caratteristiche comuni, quindi lo implemento io
        System.out.println("Sto dormendo");
    }

}