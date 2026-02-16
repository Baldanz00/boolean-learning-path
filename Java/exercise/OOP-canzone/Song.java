import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Song {

    private String title;
    private String artist;
    private Set<String> listners;

    public String getArtist() { return artist; }
    public void setArtist(String artist) { this.artist = artist; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public Song (String title, String artist){
        this.artist = artist;
        this.title = title;
        this.listners = new HashSet<>(); //traccia di chi ha ascoltato la canzone
        /*Uso HashSet perchè non consente duplicati, posso quindi tenere traccia di chi ha ascoltato la canzone
         * e il controllo è  veloce fa fare --> (!listners.contains(name))*/
    }

    //metodo howMany che riceve la lista di persone che hanno ascoltato la cansone
    //e ritorna quanti sono nuovi
    public int howMany(List<String> people){
        int newListner = 0;

        for(String person : people){
            String name = person.toLowerCase(); //toLowerCase per trattare i nomi in modo case-insensitive
            if(!listners.contains(name)){
                listners.add(name);
                newListner++;
            }
        }
        return newListner;
    }
}