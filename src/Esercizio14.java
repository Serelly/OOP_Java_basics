public class Esercizio14 {
    //Scrivi un programma che utilizza un ciclo for per stampare tutti i numeri tra 1 e 100 che
    //sono multipli di 3.

    public static void main(String[] args) {
        for(int i=1; i>=1 && i<=100; i++){
            if(i%3==0) System.out.println(i);
        }
    }
}
