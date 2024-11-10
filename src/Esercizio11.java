public class Esercizio11 {
    //Crea una matrice 3x3 con numeri predefiniti e calcola la somma di tutti gli elementi,
    //stampando il risultato.

    public static void main(String[] args) {
        int somma=0;
        int [] [] matrice = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i=0; i<matrice.length; i++) {
            for (int j=0; j<matrice[i].length; j++) {
                somma= somma+matrice[i][j];
            }
        }
        System.out.println(somma);
    }




}
