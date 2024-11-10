public class Esercizio4 {
    //Scrivi un programma che utilizza un ciclo for per stampare tutti i numeri pari tra 1 e 100.
    public static void main(String[] args) {

        for(int i=1; i>=1 && i<=100; i++){
            if(i%2==0){
                System.out.println("il numero è pari: " + i);
            }
        }
    }
}
//NB i parte dal valore 1 altrimenti se lo mettevi che partivi da 0, la condizione dopo non
// è mai verificata e quindi non entro mai nel ciclo