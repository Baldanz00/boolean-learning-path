public class Main {

    public static void main(String[] args) {
        PlayList playlist = new PlayList();

        playlist.aggiungiCanzone(new Canzone("We Are", 360));
        playlist.aggiungiCanzone(new Canzone("Diamonds on my mind", 240));
        playlist.aggiungiCanzone(new Canzone("Barrio Lambada", 340));

        playlist.stampaPlaylist();
        System.out.println("\nRimuovo We Are. ");
        playlist.rimuoviCanzone("We Are");

        playlist.stampaPlaylist();

        System.out.println("\nDurata totale della playlist: " + playlist.calcolaDurataTotale() + "s");

    }
}