public class Studente {

    /* Scrivi una classe Studente con i seguenti attributi:
     - nome,
     - cognome,
      - età.
      Implementa un costruttore che accetta tre parametri per inizializzare questi attributi.
      Aggiungi un metodo che restituisca una stringa concatenata dei valori
      (es. *Anselmo Bitta, 24 anni*).
     */
    public String name;

    public String surname;

    public int age;

    public Studente(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Lo Studente è: " + name + " " + surname + ", " + age + " anni.";
    }
}

void main() {

    Scanner scan = new Scanner(System.in);

    System.out.println("Inserisci il tuo nome: ");
    String name = scan.nextLine();

    System.out.println("Inserisci il tuo cognome: ");
    String surname = scan.nextLine();

    System.out.println("Inserisci la tua età: ");
    int age = scan.nextInt();

    Studente studente1 = new Studente(name, surname, age);

    System.out.println("Informazioni sullo studente: " + studente1);

}