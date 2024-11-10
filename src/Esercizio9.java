import java.util.Scanner;
public class Esercizio9 {
    //Scrivi un programma che utilizza una variabile intera (1-7) per rappresentare i giorni della
    //settimana e utilizza un switch-case per stampare il nome corrispondente del giorno.

    public static void main(String[] args) {
        // Creiamo un oggetto Scanner per leggere l'input dell'utente
        Scanner scanner = new Scanner(System.in);

        // Chiediamo all'utente di inserire un numero
        System.out.print("Inserisci un numero da 1 a 7: ");

        //leggiamo l'input
        int giorno = scanner.nextInt();

        switch (giorno){
            case 1:
                System.out.println("Lunedì");
                break;
            case 2:
                System.out.println("Martedì");
                break;
            case 3:
                System.out.println("Mercoledì");
                break;
            case 4:
                System.out.println("Giovedì");
                break;
            case 5:
                System.out.println("Venerdì");
                break;
            case 6:
                System.out.println("Sabato");
                break;
            case 7:
                System.out.println("Domenica");
                break;
            default:
                System.out.println("Numero non valido! Inserire un numero tra 1 e 7.");
        }
        //chiudiamo lo scanner
        scanner.close();

    }

}
