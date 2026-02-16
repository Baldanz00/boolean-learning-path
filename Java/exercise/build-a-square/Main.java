void main() {
    /*Ti darò un intero. Crea un quadrato di asterischi
     * da quell'intero.
     * esempio: n = 3, 3x3
     * ***
     * ***
     * ***
     * */
    Scanner scan = new Scanner(System.in);
    System.out.println("Dammi un numero intero per creare il quadrato");
    int n = scan.nextInt();
    for (int i = 0; i < n; i++) { //riga
        for (int j = 0; j < n; j++) { // stampa n colonne
            System.out.print("*");
        }
        System.out.println();
    }
}