void main(String[] args) {
/*Descrizione

Scrivete un programma che, dati due interi N e M, con N > M > 0,
come parametri sulla linea di comando emetta nel flusso di uscita un
disegno come il seguente (qui N è pari a 4 e M a 2):

a efghi y
b d   j x
c c   k w
d b   l v
e a   m u
f       t
g       s
h       r
ijklmnopq
ossia due "U" i cui lati sono composti dalle lettere dell'alfabeto inglese:
la prima ha lati formati da 2N + 1 caratteri e rivolta verso l'alto,
la seconda coi lati formati da 2M + 1 caratteri e rivolta verso il basso, disposta al centro della prima e allineata al suo lato superiore.*/

    /*Lista di caratteri dell'alfabeto ( U grande) --> per la u piccola rileggo p
    /*griglia quadrata w = 2*n + 1
    * sulla griglia devo fare il lato sx dall'alto al basso
    * la base come linea
    * lato dx dal basso verso l'alto
    *
    * La larghezza è 2*m+1
    * Altezza 2*m+1
    * */

    Scanner scan = new Scanner(System.in);
    int N , M;
    if(args.length >= 2){
        try{
            N = Integer.parseInt(args[0]);
            M = Integer.parseInt(args[1]);
        } catch (NumberFormatException e){
            System.out.println("Argomenti non validi");return;
        }
    } else{
        System.out.println("Inserisci un numero N : ");
        N = scan.nextInt();
        System.out.println("Inserisci un numero M: ");
        M = scan.nextInt();
    }
    if(!(N > M && M > 0)){
        System.out.println("Condizioni non valide.");
        return;
    }

    int W = 2 * N + 1; //dimensione della mia griglia
    int lunghezza = 6 * N + 1;

    //lista di caratteri dell'alfabeto
    char[] Lista1 = new char[lunghezza];
    char cur = 'a';
    for(int i = 0; i < lunghezza; i++){
        Lista1[i] = cur;
        cur ++;
        if(cur > 'z') cur = 'a'; // wrap dopo 'z'
    }

    //inserisco gli spazi nella criglia
    char[][] grid = new char[W][W];
    for(int r = 0; r < W; r++){
        for(int c = 0; c < W; c++){
            grid[r][c] = ' ';
        }
    }

    //ciclo per aggiungere i caratteri nella griglia: lato sx
    for(int i = 0; i <= 2 * N; i++){
        grid[i][0] = Lista1[i];
    }
    for(int j = 0; j <= 2 * N; j++){
        grid[2 * N][j] = Lista1[2 * N + j];
    }
    //lato dx
    int latoDxIndex = 4 * N + 1;
    for(int t = 0; t <= 2 * N - 1; t++){
        int row = 2 * N - 1 - t;
        grid[row][2 * N] = Lista1[latoDxIndex + t];
    }

    //U verso il basso piccola
    int center = N;
    int uPiccola = 2 * M + 1;

    for(int i = 0; i < uPiccola; i++){
        grid[0][center - M + i] = Lista1[N + i];
    }

    //sx
    for(int i = 0; i < uPiccola; i++){
        grid[i][center - M] = Lista1[N - 1];
    }
    //dx
    for(int i = 0; i < uPiccola; i++){
        grid[i][center + M] = Lista1[N + 2 * M + i];
    }

    //stampa della griglia
    for(int r = 0; r < W; r++){
        int rigaSenzaSpaziDx = -1;
        for(int c = 0; c < W; c++){
            if(grid[r][c] != ' ') rigaSenzaSpaziDx = c;
        }
        if(rigaSenzaSpaziDx == -1){
            System.out.println();
        } else {
            StringBuilder sb = new StringBuilder();
            for(int c = 0; c <= rigaSenzaSpaziDx; c++){
                sb.append(grid[r][c]);
            }
            System.out.println(sb.toString());
        }
    }
}