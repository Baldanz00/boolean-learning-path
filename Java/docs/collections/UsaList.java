import java.util.ArrayList;
import java.util.List;

public class UsaList {

    void main(){

        List<Integer> list = new ArrayList<>();
        //interfaccia per la dichiarazione e implementazione dell'istanza
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);

        System.out.println(list);

        //accesso in base alla posizione
        System.out.println("Elemento a posizione 2: " + list.get(2));

        list.set(2,5); //-> indice 2 metto l'elemento 5
        System.out.println(list);

        list.add(2,65); //fa uno shift, a posizione 2 mette 65 ma sposta tutti gli altri di 1
        //senza sovrascrivere la posizione 2
        System.out.println(list);

    }
}