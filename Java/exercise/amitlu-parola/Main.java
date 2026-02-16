void main() {
/*
Amitlu parola

Descrizione

Scrivete un programma che, data una sequenza di parole nel flusso di ingresso,
emetta nel flusso di uscita la parola che risulterebbe ultima rovesciando
(dal primo all'ultimo carattere) le parole in ingresso e disponendo
le parole così ottenute in ordine alfabetico.

Ad esempio, avendo nel flusso di ingresso le parole

zorro --> orroz
cane --> enac
fuzz --> zzuf
mela --> alem
il programma emette fuzz nel flusso di uscita, infatti rovesciando ed ordinano le parole si ottiene

alem
enac
orroz
zzuf
da cui si evince che l'ultima parola è fuzz.
 */
    Scanner scanner = new Scanner(System.in);
    System.out.println("Inserisci una serie di parole");
    String frase = scanner.nextLine();

    String[] parole = frase.split("\\W+");//diviso per qualunque carattere che non è una letera

    //Map parola rovesciata -> parola originale
    Map<String, String> mappa = new HashMap<>();

    for(String p : parole){
        String parolaRovesciata = new StringBuilder(p).reverse().toString();
        mappa.put(parolaRovesciata,p);
    }

    //ordino le parole rovesciate in ordine alfabetico
    List<String> rovesciate = new ArrayList<>(mappa.keySet());
    Collections.sort(rovesciate);

    //prendo l'ultima
    String ultimaRovesciata = rovesciate.get(rovesciate.size()-1);

    //stampa della parola originale
    System.out.print(mappa.get(ultimaRovesciata));
}