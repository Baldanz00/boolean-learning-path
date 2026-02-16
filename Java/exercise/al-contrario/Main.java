void main() {
    /*Scrivere un programma che data una sequenza di al più di 100 numeri interi positivi nel flusso in ingresso, li metta
     * nel flusso di uscita dall'ultimo letto al primo.
     * input: 1,2,3,4,5
     * output: 5,4,3,2,1*/
//per invertire una sequenza --> salvo la sequenza in un array ---> stsmpo l'array al contrario
    /*1. scanner per il flusso in ingresso.
     * while(scan.hasNextInt()) perchè non so quanti numeri mi daranno in ingresso
     * il limite massimo è 100 elementi
     *
     * Devo inserire questi elementi in un array int[] elencoNumeri = new int[10+;
     * int contatore = 0;
     *
     * Devo salvare ogni volta che leggo : numeri[count] = scan.nextInt(); contatore**;
     *
     * Per stapare i numeri al contrario : for(int i = contatore -1; i>=0; i--)
     * Sysout(numeri[i] + " ");*/

    System.out.println();
    Random numeriRandom = new Random();
    int[] elencoNumeri = new int[100]; //ho il mio array di 100 elementi al massimo
    int contatore = 0;

    for(int i = 0; i < 100; i++){
        elencoNumeri[i] = numeriRandom.nextInt(100);
    }
    System.out.println("L'array in ordine è: ");
    for(int i = 0; i < elencoNumeri.length; i++){
        System.out.println("Posizione " + i +" : " + elencoNumeri[i] + " ");
    }
    System.out.println("\nL'array al contrario è: ");
    for(int i = elencoNumeri.length - 1 ; i >= 0; i--){
        System.out.println( "Posizione " + i +" : " + elencoNumeri[i] + " ");
    }

}