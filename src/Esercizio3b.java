public class Esercizio3b {
    //Scrivi un programma che inizializza un array con 10 numeri double, quindi calcola e stampa
    //la media degli elementi.
    public static void main(String[] args) {

        double[] a = {1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0};
        double somma=0.0;

        for(double numero : a){
            somma+=numero;
        }
        System.out.println("la media è:" + somma/a.length);


    }
}
