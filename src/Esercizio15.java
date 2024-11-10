public class Esercizio15 {
    //Crea una matrice 3x3 e verifica se è simmetrica rispetto alla diagonale principale,
    //stampando "simmetrica" o "non simmetrica" a seconda del risultato.

    public static void main(String[] args) {
      

        //creazione e iniziallizzazione diretta della matrice
        int [] [] matrice = {
                {2,4,5},
                {4,6,7},
                {5,7,9}
        };
        //stampo matrice
        for(int i = 0; i < matrice.length; i++) {
            for(int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
        //verifica simmetria    //NOTA boolean è un tipo di dato che può essere solo TRUE o FALSE
        boolean simmetrica = true;  //inizialmente assumiamo che sia simmetrica
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (matrice[i][j] != matrice[j][i]) { //Se troviamo elementi non corrispondenti, cambiamo in false
                    simmetrica = false;
                    break;  //appena troviamo un elemento non simmetrico, non serve controllare il resto
                }           //primo break: esce dal ciclo interno
            }
            if (!simmetrica) {
                break; //secondo break: esce dal ciclo esterno
            }
        }
        // Stampa il risultato
        if (simmetrica) {
            System.out.println("La matrice è simmetrica");
        } else {
            System.out.println("La matrice non è simmetrica");
        }
    }
}
