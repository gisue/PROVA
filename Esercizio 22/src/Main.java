public class Main {
    public static void main(String[] args) {
        Ingegnere i1 = new Ingegnere("Giacomo", "Poretti", 30, "San Marco");
        Architetto a1 = new Architetto("Massimo", "Rossi", 12, "Gioconda");

        i1.stampa();
        System.out.println();
        a1.stampa();
    }
}