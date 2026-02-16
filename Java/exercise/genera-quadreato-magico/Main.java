void main() {
    /*
     * NxN con N dispari, la matrice contiene i numeri da 1 a N al 2
     * 1. 1 nella prima riga, colonna centrale
     * 2. per ogni numero successivo, mi muovo in alto a destra (riga -1 , colonna +1)
     *  se la cella è occupata, scendi in basso (riga +1)
     * 3. La matrice è avvolta: se salgo sopra la linea 0 -> vado all'ultima riga;
     * se esco a destra -> vado nella prima colonna
     */

    //Coordinare riga, colonnaq
    // riga = 0;
    //colonna = N/2

    //per ogni numero x da 1 a Nquadro -> inserisci x in mat[riga][colonna]
    //calcola la posizione in alto a dx

    //nuovaRiga = (riga - 1 + N)
    //nuovaColonna = (colonna + 1)%N

    //se la nuova cella è vuota, vai li. Altrimenti vai sotto
    //riga = (riga +1) % N

    //aggiorno riga e colonna e vai avanti
    Scanner scanner = new Scanner(System.in);

    System.out.println("Inserisci N (deve essere dispari):");
    int N = scanner.nextInt();

    if(N % 2 == 0) {
        System.err.println("Il numero N deve essere dispari");
        return;
    }

    int[][] mat = new int[N][N]; //matrice N x N
    int riga = 0;
    int colonna = N / 2;

    for(int k = 1; k <= N * N; k++) {
        mat[riga][colonna] = k;

        int nuovaRiga = (riga - 1 + N) % N;
        int nuovaColonna = (colonna + 1) % N;

        //controllo se la cella è occupata
        if (mat[nuovaRiga][nuovaColonna] != 0) {
            riga = (riga + 1) % N;
        } else {
            riga = nuovaRiga;
            colonna = nuovaColonna;
        }
    }

    //stampa della matrice
    for(int i = 0; i < N; i++){
        for(int j = 0; j < N; j++){
            System.out.printf("%4d", mat[i][j]);
        }
        System.out.println();
    }

}