public class Canzone {
    /*Crea una classe Canzone con attributi private titolo (String) e durata (int, in secondi).
    Aggiungi un costruttore e un metodo toString() per rappresentare la canzone come stringa (es. "Imagine - 240s").
    Crea una classe Playlist con un attributo private: brani, che sarà un ArrayList<Canzone>.
    Implementa i seguenti metodi nella classe Playlist:
    aggiungiCanzone(Canzone canzone): aggiunge un brano alla lista.
    rimuoviCanzone(String titolo): cerca e rimuove un brano dalla lista dato il suo titolo.
    stampaPlaylist(): stampa l'elenco di tutte le canzoni nella playlist, una per riga.
    calcolaDurataTotale(): calcola e restituisce la durata totale della playlist in secondi, usando un ciclo for-each.
     */
    private String titolo;
    private int durata;

    public Canzone(String titolo, int durata){
        this.titolo = titolo;
        this.durata = durata;
    }

    public String getTitolo(){
        return this.titolo;
    }
    public int getDurata(){
        return durata;
    }
    @Override
    public String toString(){
        return titolo + " " + ", Durata della canzone: " + durata + "s";
    }

}