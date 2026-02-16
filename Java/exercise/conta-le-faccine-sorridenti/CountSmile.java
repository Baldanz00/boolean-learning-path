public class CountSmile {
    /*Dato un array (arr) come argomento,
    completa la funzione countSmileys
    che dovrebbe restituire il numero totale
    di volti sorridenti.

    Regole per un volto sorridente:
    - Ogni faccina sorridente deve contenere un paio di occhi validi.
    Gli occhi possono essere contrassegnati come : o ;
    - Una faccina sorridente può avere un naso, ma non deve farlo.
    I caratteri validi per un naso sono - o ~
    - Ogni volto sorridente deve avere una bocca sorridente che
    dovrebbe essere contrassegnata con ) o D

    Non sono ammessi caratteri aggiuntivi.
    Esempi di faccine sorridenti valide: :) :D ;-D :~)
    Facce sorridenti non valide:  ;( :> :} :]

countSmileys([':)', ';(', ';}', ':-D']);       // should return 2;
countSmileys([';D', ':-(', ':-)', ';~)']);     // should return 3;
countSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;

Nel caso di un array vuoto restituisci 0.
Non sarai testato con input non valido (l'input sarà sempre un array).
L'ordine degli elementi del viso (occhi, naso, bocca) sarà sempre lo stesso.
    */

    public static int countSmileys(String[] arr){
        if(arr == null || arr.length == 0) return 0;

        String pattern = "^[;:][-~]?[)D]$"; //^  inizio
        //[;:] occhi validi (: oppure ;) obbligatorio
        //[-~]? naso opzionale - il ? indica 0 o 1 volta
        // [)D] bocca obbligatoria ) oppure D
        // $ fine
        int count = 0;

        for(String s : arr){
            if(s != null && s.matches(pattern)){
                count++;
            }
        }
        return count;
    }
}