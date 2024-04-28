import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leggi = new Scanner(System.in);
        System.out.println("Scrivi quanti prodotti massimo vuoi avere");
        int nMax = leggi.nextInt();
        Magazzino ikea = new Magazzino(nMax);

        Interfaccia i = new Interfaccia(ikea);
        i.scelta();
    }
}