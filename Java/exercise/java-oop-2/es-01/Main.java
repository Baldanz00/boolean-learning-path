
public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        pizza1.aggiungiMozzarella()
                .aggiungiPomodoro()
                .aggiungiProsciutto();

        System.out.println(pizza1);
    }

}