import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leggi = new Scanner(System.in);
        System.out.print("Scrivi il numero massimo si persone nel gruppo: ");
        int nMax = leggi.nextInt();
        Gruppo g = new Gruppo(nMax);

        String scelta = "";
        while(!scelta.equals("6")){
            System.out.print("""
                       1. Aggiungi una persona
                       2. Stampa una persona
                       3. Stampa tutte le persone
                       4. Modifica
                       5. Elimina
                       6. Esci
                       """);
            Scanner input = new Scanner(System.in);
            scelta = input.nextLine();
            int c = 0;
            if(scelta.equals("1")){
                System.out.println("Aggiungi una persona");
                System.out.print("Scrivi il cf: ");
                String cf = input.nextLine();
                System.out.print("Scrivi il nome: ");
                String nome = input.nextLine();
                System.out.print("Scrivi il cognome: ");
                String cognome = input.nextLine();
                System.out.print("Scrivi l'età: ");
                int età = input.nextInt();
                g.aggiungi(cf, nome, cognome, età);
            }
            else if(scelta.equals("2")){
                System.out.println("Scrivi il cf della persona: ");
                String cfPersona = input.nextLine();
                g.stampa(cfPersona);
            }
            else if(scelta.equals("3")){
                g.stampaTutti();
            }
            else if(scelta.equals("4")){
                System.out.print("Scrivi il cf della persona da modificare: ");
                String cf = input.nextLine();
                System.out.print("Scrivi il nome: ");
                String nome = input.nextLine();
                System.out.print("Scrivi il cognome: ");
                String cognome = input.nextLine();
                g.modifica(cf, nome, cognome);
            }
            else if(scelta.equals("5")){
                System.out.print("Scrivi il cf della persona da eliminare: ");
                String cf = input.nextLine();
                g.elimina(cf);
            }
        }
        System.out.println("Grazie per aver utilizzato il programma!!!");
    }
}