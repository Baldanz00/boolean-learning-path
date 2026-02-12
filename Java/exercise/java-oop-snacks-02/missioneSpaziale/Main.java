import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<MissioneSpaziale> missioni = new ArrayList<>();
        missioni.add(new MissioneScientifica("Studiare il suolo lunare"));
        missioni.add(new MissioneCommerciale("SpaceX"));
        missioni.add(new MissioneScientifica("Cercare tracce di vita"));
        for (MissioneSpaziale m : missioni) {
            m.stampaDettagli();
            System.out.println("---");
        }
        System.out.println("Totale missioni: " + MissioneSpaziale.getNumeroMissioni());
    }
}