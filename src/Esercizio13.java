public class Esercizio13 {
    //Scrivi un programma che utilizza un ciclo for per stampare tutti i numeri primi tra 1 e 50.
    public static void main(String[] args) {

        System.out.println("i numeri primo sono:");
        for(int i=1;i>=1 && i<=50;i++){
            if (i>1) {
                if(i%1==0 && i%i==0) System.out.println(i);
            }


        }
    }
}
