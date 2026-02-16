import Snack3RegistroStudenti.Studente;

public class RegistroStudenti {
    /*Crea una classe RegistroStudenti che rappresenti un registro di studenti.
    Utilizza un array privato per memorizzare oggetti Studente.
    Studente [] registro = new Studente [3];
    registro [0] = new Studente = "Marco" "bianchi"....

    Implementa un costruttore senza parametri per inizializzare il registro vuoto e un
    metodo pubblico per aggiungere studenti al registro.
    Aggiungi un metodo che stampi la lista degli studenti.
     */
    private Studente[] registro;
    private int index = 0; //controlla le celle libere

    public RegistroStudenti(){
        registro = new Studente[3]; //registro vuoto con 3 cele libere
    }

    public void addStudente(Studente studente1){
        if(index < registro.length){
            registro[index] = studente1;
            index ++;
        }else {
            System.out.println("Registro pieno, non ci sono posti disponibili");
        }
    }

    public void stampaRegistro(){
        for(int i = 0; i < registro.length; i++){
            if(registro[i] != null){
                System.out.println(registro[i]);
            }
        }
    }

    void main (){

        RegistroStudenti registro1 = new RegistroStudenti();
        registro1.addStudente(new Studente("Gioia", "Travaglini", 25));
        registro1.addStudente(new Studente("Domenico", "Collini", 29));
        registro1.stampaRegistro();

    }
}