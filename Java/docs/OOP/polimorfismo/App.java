import java.util.Scanner;
import poligono.Poligono;
import quadrato.Quadrato;
import rettangolo.Rettangolo;
import triangolo.TriangoloRettangolo;

public class App {
    public static void main(String[] args) throws Exception {
        TriangoloRettangolo t1 = new TriangoloRettangolo(3, 4, 5);
        System.out.println(t1.getArea());

        //vale lo stesso per quadrato e rettangolo

        /*Altro modo di usare il polimorfismo.. */
        Poligono p1 = new Rettangolo(10, 20);//Rettangolo è un estensione di Poligono
        System.out.println(p1.getArea());

        //Altro modo
        //Ambiente di runtime(le celle di memoria vengono istanziate di volta in volta) + polimorfismo
        System.out.println("Indicami di quale poligono devo calcolare il perimetro");
        Scanner scan = new Scanner(System.in);
        System.out.println("Scegli: \n - 1 se vuoi un triangolo ,\n - 2 se vuoi un quadrato ,\n - 3 se vuoi un rettangolo");
        int scelta = scan.nextInt();
        Poligono p2 = null;
        if(scelta == 1){
            System.out.println("Hai scelto il Triangolo Rettangolo, inserisci cateto1, cateto2 e ipotenusa: ");
            int cateto1 = scan.nextInt();
            int cateto2 = scan.nextInt();
            int ipotenusa = scan.nextInt();
            p2 = new TriangoloRettangolo(cateto1, cateto2, ipotenusa);
        }else if (scelta == 2){
            System.out.println("Hai scelto il Quadrato, inserisci il lato: ");
            int lati = scan.nextInt();
            p2 = new Quadrato(lati);
        }else if(scelta == 3){
            System.out.println("Hai scelto il Rettangolo, inserisci base, altezza");
            int base = scan.nextInt();
            int altezza = scan.nextInt();
            p2 = new Rettangolo(base, altezza);
        }else {
            System.out.println("Scelta sbagliata");
        }

        if(p2 == null){
            System.out.println("Non saprai Area e Perimetro");
        } else{
            System.out.println(String.format("L'area è %d , il perimetro è %d ", p2.getArea() + p2.getPerimetro()));
        }
    }
}