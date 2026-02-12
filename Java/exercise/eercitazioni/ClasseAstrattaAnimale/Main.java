import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animale> zoo = new ArrayList<>();
        zoo.add(new Leone("Leone"));
        zoo.add(new Elefante("Elefante"));
        zoo.add(new Serpente("Serpente"));

        for(Animale a : zoo){
            a.faiVerso();
        }
    }
}