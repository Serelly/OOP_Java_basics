public class Esercizio8 {
    //Scrivi un programma che utilizza un ciclo for per contare quanti numeri pari e quanti
    //numeri dispari ci sono tra 1 e 50 e stampa i risultati

    public static void main (String[] args) {
        int pari=0;
        int dispari = 0;


        for(int i=1; i<= 50; i++ ){
            if(i%2==0){
                pari= pari+1;
            }
            else {
                dispari = dispari + 1;
            }
        }
        System.out.println("Numeri pari: " +pari);
        System.out.println("Numeri dispari:" +dispari);

    }

}
