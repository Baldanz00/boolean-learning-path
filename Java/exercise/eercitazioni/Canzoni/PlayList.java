import java.util.ArrayList;

public class PlayList {
    private ArrayList<Canzone> canzoni;
    public PlayList(){
        this.canzoni = new ArrayList<>();
    }

    public void aggiungiCanzone(Canzone canzone){
        canzoni.add(canzone);
    }
    public void rimuoviCanzone(String titolo){
        canzoni.removeIf(c -> c.getTitolo().equalsIgnoreCase(titolo));
    }

    public void stampaPlaylist(){
        System.out.println("PlayList: ");
        for(Canzone c : canzoni){
            System.out.println(c);
        }
    }

    public int calcolaDurataTotale(){
        int totale = 0;
        for(Canzone c : canzoni){
            totale += c.getDurata();
        }
        return totale;
    }
}