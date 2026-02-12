import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private List<String> ingredienti;


    public Pizza() {
        this.ingredienti = new ArrayList<>();
    }

    public Pizza aggiungiMozzarella() {
        this.ingredienti.add("mozzarella");
        return this;
    }

    public Pizza aggiungiPomodoro() {
        this.ingredienti.add("pomodoro");
        return this;
    }

    public Pizza aggiungiProsciutto() {
        this.ingredienti.add("prosciutto");
        return this;
    }

    @Override
    public String toString() {
        return "Pizza con ingredienti: " + String.join(", ", ingredienti);
    }
}