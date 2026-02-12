
/*stampa i nomi che iniziano per A
Obiettivo: Dato un array di nomi, stampa solo quelli che iniziano con la lettera 'A'.
Esempio: String[] nomi = {"Anna", "Luca", "Alberto", "Giulia", "Andrea"};
Output: Anna, Alberto, Andrea */

public class ArrayStringhe {
    public static void main(String[] args) {

        String[] nomi = {"Anna", "Luca", "Alberto", "Giulia", "Andrea"};

        System.out.println("I nomi che iniziano con la 'A' all'interno dell'array sono : ");
        for(String nome : nomi) {
            if(nome.toLowerCase().startsWith("A")) {
                System.out.println(nome);
            }
        }
    }

}