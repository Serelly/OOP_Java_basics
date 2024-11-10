public class Esercizio12 {
    //Scrivi un programma che crea una matrice identità 3x3 e stampa il risultato.

    public static void main(String[] args) {
        //creo una matrice 3x3
        int [] [] matriceIdentita = new int [3][3];

        //riempire la matrice
        for(int i=0; i<matriceIdentita.length;i++) {
            for(int j=0; j<matriceIdentita[i].length;j++) {
               //se i=j siamo sulla diagonale principale
                if(i==j) {
                    matriceIdentita[i][j] = 1;
                }else {
                    matriceIdentita[i][j] = 0;
                }
            }
        }
        //stampare la matrice
        for(int i=0; i<matriceIdentita.length;i++) {
            for(int j=0; j<matriceIdentita[i].length;j++) {
                System.out.print(matriceIdentita[i][j] + " ");
            }
            System.out.println(); //vai a capo dopo ogni riga
        }
    }
}
