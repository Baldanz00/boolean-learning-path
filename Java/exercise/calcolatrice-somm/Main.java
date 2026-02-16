void main() {
//Scrivere un programma che, data una semplice operazione aritmetica nel flusso in ingresso,
    Scanner scanner = new Scanner(System.in);
    System.out.println("Inserisci la somma che vuoi fare:");

    int num1 = scanner.nextInt();
    String operator = scanner.next();
    int num2 = scanner.nextInt();

    //ne emetta il flusso in uscita. Il programma deve considerare solo somma + tra due operandi interi
    if (!operator.equals("+")) {
        System.out.println("Operatore non ammesso nella somma");

    } else {
        int somma = num1 + num2;
        System.out.println("La somma è: " + somma);
    }
    scanner.close();
}