public class Ship {
    /*Ciao amico!

Sei il leader di un piccolo equipaggio di pirati. E hai un piano.
Con l'aiuto di OOP desideri creare un sistema piuttosto efficiente per identificare le navi con bottino pesante a bordo!

Sfortunatamente per te, la gente pesa molto in questi giorni, quindi come fai a sapere se una nave è piena di oro e non di persone?

Inizi scrivendo una classe / struttura generica di Ship:

public class Ship {
    private final double draft;
    private final int crew;

    public Ship(double draft, int crew) {
        this.draft = draft;
        this.crew = crew;
    }
}
Ogni volta che le tue spie vedono una nuova nave entrare nel molo, creeranno un nuovo oggetto nave in base alle loro osservazioni:

Ship titanic = new Ship(15, 10);
Compito

Hai accesso alla nave "draft" e "crew". "Draft" è il peso totale della nave e "equipaggio" è il numero di umani sulla nave.

Ogni membro dell’equipaggio aggiunge 1,5 unità al pescaggio della nave.
Se, dopo aver tolto il peso dell’equipaggio, il pescaggio è ancora superiore a 20, allora la nave vale la pena di essere saccheggiata.
Qualsiasi nave che pesa così tanto deve avere un bel bottino a bordo!
Aggiungi il metodo

isWorthIt
per decidere se la nave è degna di saccheggio. Per esempio:

titanic.isWorthIt() == false
Buona fortuna e che tu possa trovare GOOOLD!
*/


    private final double draft; //stima del peso della nave
    private final int crew; //conteggio dell'equipaggio a bordo

    public Ship(double draft, int crew) {
        if (draft < 0) {
            throw new IllegalArgumentException("Draft non può essere negativo");
        }
        if (crew < 0) {
            throw new IllegalArgumentException("Crew non può essere negativo");
        }
        this.draft = draft;
        this.crew = crew;
    }

    public boolean isWorthIt(){
        double weighOfCrew = crew * 1.5; //ogni persona aggiunge 1.5
        double draftWithoutCrew = draft - weighOfCrew; // sottraggo il peso delle persone
        return draftWithoutCrew > 20; // se è >20 ne vale la pena
    }


}