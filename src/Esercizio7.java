public class Esercizio7 {
    //Scrivi un programma che utilizza un ciclo while per calcolare la somma dei numeri da 1 a
    //100 e stampa il risultato.

    public static void main(String[] args) {
        int i=1;
        int somma=0;

        while(i>=1 && i<=100){
            somma+=i;
            i++;
        }
        System.out.println("La somma è :" + somma);
    }









}
