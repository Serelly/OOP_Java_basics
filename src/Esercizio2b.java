public class Esercizio2b {

    //Scrivi un programma che inizializza un array con cinque numeri interi, quindi calcola e
    //stampa la somma degli elementi.

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 3};
        int somma = 0;

        for(int numero : a) {
            somma += numero;
        }
        System.out.println(somma);
    }
}
