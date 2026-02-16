public class PasswordCreator {
    /* - nome;
     *  - cognome;
     *  - colore preferito;
     *  - data di nascita (gg.mm.aaaa);
     *
     * Genera una password stampando a video nome-cognome-colore-(somma di giorno+mese+anno);*/

    public String name;

    public String surname;

    public String birthday;

    public String favouriteColor;

    public int day;

    public int mounth;

    public int year;

    void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome: ");
        String name = scan.nextLine();

        System.out.println("Inserisci il tuo cognome: ");
        String surname = scan.nextLine();

        System.out.println("Inserisci il tuo colore preferito: ");
        String favouriteColor = scan.nextLine();

        System.out.println("Inserisci il giorno di nascita: ");
        int day = scan.nextInt();

        System.out.println("Inserisci il mese di nascita in forma numerica:");
        int mounth = scan.nextInt();

        System.out.println("Inserisci l'anno di nascita:");
        int year = scan.nextInt();

        int sumBirthday = day + mounth + year;

        System.out.println("La tua password in chiaro è: " + name + "-" + surname + "-" + favouriteColor + "-" + sumBirthday);
    }
    /* Gioia-Travaglini-viola-2022 --> (12+10+2000) */

}