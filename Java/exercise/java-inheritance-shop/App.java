import Cuffie.Cuffie;
import Prodotto.Prodotto;
import Smartphone.Smartphone;
import Televisori.Televisori;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {




        Prodotto T1 = new Televisori(12345, "Samsung", 1499.99, 22, 55, true);
        Prodotto s1 = new Smartphone("IDE34567", 256);
        Prodotto c1 = new Cuffie(1234576, "Razer Kraken", 159.99, 22, "Nero/Viola", false, true);


        System.out.println("Scegli: \n -1 se vuoi procedere ell'acquisto di un Televisore; " +
                " \n - 2 se vuoi procedere all'acquisto di uno smartphone; \n - 3 se vuoi procedere all'acquisto di cuffie");

        Scanner scan = new Scanner(System.in);

        int scelta=scan.nextInt();

        if(scelta == 1 ){
            System.out.println(T1);
        }else if(scelta == 2){
            System.out.println(s1);
        }else if(scelta == 3){
            System.out.println(c1);
        }else {
            System.out.println("Scelta non valida.");
        }


    }
}