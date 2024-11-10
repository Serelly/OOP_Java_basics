public class Esercizio16 {
    //Crea un array di 5 numeri interi, calcola la media aritmetica degli elementi e stampa il
    //risultato.

    public static void main (String[] args) {
        int [] a={1,4,5,6,7};
        int somma=0;


        for(int i=0; i<a.length; i++){
            somma=somma+a[i];
        }

        System.out.println("la media è:" + (double)somma/a.length);
    }

}
//NB: per ottenere la media più precisa posso fare il cast della somma a double
// prima di fare il calcolo della media!!!
//con la media conviene usare double per ottenere un risultato più preciso
