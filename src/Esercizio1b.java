
import java.lang.Math;
public class Esercizio1b {
//Usando solamente l’operatore condizionale, scrivere un programma che legga tre interi e
//stampi il maggiore. Ripetere il problema usando Math.max.
    public static void main(String[] args) {

        int a=1;
        int b=2;
        int c=3;
        int maggiore = Math.max(a,Math.max(b,c));
        System.out.println("Numero maggiore: " + maggiore);

    }
}
