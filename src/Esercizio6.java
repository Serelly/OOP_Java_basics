public class Esercizio6 {
    //Crea un enum per i giorni della settimana. Quindi scrivi un programma che stampa un
    //messaggio differente per ciascun giorno.

    enum Settimana {
        Lunedi("Che palle"),
        Martedi("palestra"),
        Mercoledi("lezione"),
        Giovedi("pasta"),
        Venerdi("carbonara"),
        Sabato("shawarma"),
        Domenica("bello");

        private final String messaggio;

        Settimana(String messaggio) {
            this.messaggio = messaggio;
        }

        public String getMessaggio() {
            return messaggio;
        }
    }

    public static void main(String[] args) {
        for (Settimana giorno : Settimana.values()) {
            System.out.println(giorno + " " + giorno.getMessaggio());
        }
    }
}
