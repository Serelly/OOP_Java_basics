public class Esercizio2 {
    //Scrivi un programma che inizializza un array con cinque numeri interi, quindi calcola e
    //stampa la somma degli elementi.

    public static void main(String[] args){
        int[] a={1,3,4,5,3};
        int somma=0;

        for(int i=0; i<a.length; i++){
            somma+=a[i];
        }
        System.out.println("la somma è:" + somma);
    }
}
