/* Crea una funzione che , dato un numero restituisca un array rispettando i requisiti richiesti:
* Examples

420 should return ["4", "42", "420"]
2017 should return ["2", "20", "201", "2017"]
2010 should return ["2", "20", "201", "2010"]
4020 should return ["4", "40", "402", "4020"]
80200 should return ["8", "80", "802", "8020", "80200"]
PS: The input is guaranteed to be an integer in the range [0, 1000000]*/
public class NumeroInStringa{

    public static String[] numeroInStringa(int n){
        String s = String.valueOf(n); // converto il numero in stringa
        int length = s.length();

        String[] arrayStringhe = new String[length];

        for(int i = 0; i < length; i++){
            arrayStringhe[i] = s.substring(0, i + 1); //riempe l'array con stringhe progressive
        }
        return arrayStringhe;
    }
}
void main() {
    int n = 420;
    String[] arrayDaStampare = NumeroInStringa.numeroInStringa(n);
    System.out.print(Arrays.toString(arrayDaStampare));
}