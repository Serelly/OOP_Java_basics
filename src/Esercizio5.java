public class Esercizio5 {
    //Scrivi un programma che usa un ciclo for per stampare tutti i numeri compresi tra 1 e 100
    //che sono multipli sia di 3 che di 5.

    public static void main(String[] args) {
        for(int i=1; i>=1 && i<=100; i++ ){
            if(i%3==0 && i%5==0) System.out.println(i);
        }
        
        // Un numero è multiplo di un altro quando è divisibile per quel numero,
        // cioè quando il resto della divisione è 0. In Java, questo si verifica usando l'operatore modulo %.
    }



}
