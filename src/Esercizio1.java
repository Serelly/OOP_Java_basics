public class Esercizio1 {
    //Usando solamente l’operatore condizionale, scrivere un programma che legga tre interi e
    //stampi il maggiore.

    public static void main(String[] args) {
        int a=1;
        int b=3;
        int c=5;

        if(a>b && a>c){
            System.out.println("Il maggiore è: " + a);
        }else if(b>a && b>c){
            System.out.println("Il maggiore è: " + b);
        }else {
            System.out.println("il maggiore è: " + c);
        }


    }


}
