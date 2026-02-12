import Concrete.Gatto;
import Concrete.Vacca;
import astratte.Animale;
import interfacce.Camminante;


public class App {
    public static void main(String[] args) throws Exception {

        Animale a = new Vacca();
        a.faiVerso();
        a.getCibo();//non stampa nulla perchè il metodo è vuoto...finchè non rendi il metodo astratto
        a.dormi();
        Animale b = new Gatto();
        b.faiVerso();
        b.getCibo();//non stampa nulla perchè il metodo è vuoto... finchè non rendi il metodo astratto
        b.dormi();
        /* La classe Astratta ha comportamenti comuni ma che differiscono per implementazione */

        /* Se io lascio un metodo vuoto, le sottoclasse possono non implementarlo perchè non è astratto.*/

        Camminante c1 = new Gatto();
        c1.cammina();

        Camminante c2 = new Vacca();
        c2.cammina();
    }
}