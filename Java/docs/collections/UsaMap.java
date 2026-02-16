import java.util.HashMap;
import java.util.Map;

public class UsaMap {
    void main(){

        Map<String, Integer> m = new HashMap<>();
        m.put("uno",1);
        m.put("due",2);
        m.put("tre", 3);

        System.out.println(m);

        //ricerca per chiave
        System.out.println("Valore due : " + m.get("due"));

        //conoscere se contiene una chiave
        System.out.println( m.containsKey("due")); // -> ritorna un booleano

        //conoscere se contiene un valore
        System.out.println(m.containsValue(2));

        //rimuovere un elemento
        m.remove("due");
        System.out.println("Dopo aver rimosso key = 2 \n" + m);

        /*
        Se faccio Set<K> keySet(); mi restituisce tutto l'intieme delle chiavi.
        Se faccio Set<V> values(); mi restituisce l'insiene dei valori.

         */
    }
}