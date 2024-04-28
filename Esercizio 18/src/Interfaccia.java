import java.util.Scanner;
class Interfaccia {
    public Magazzino ikea;
    public Interfaccia(Magazzino ikea){
        this.ikea = ikea;
    }
    public void scelta(){
        Scanner leggi = new Scanner(System.in);
        String scelta = "";
        while(!(scelta.equals("6"))){
            Scanner input = new Scanner(System.in);
            System.out.println("1.Aggiungi un prodotto");
            System.out.println("2.Elimina un prodotto");
            System.out.println("3.Modifica un prodotto");
            System.out.println("4.Stampa un prodotto");
            System.out.println("5.Stampa tutti");
            System.out.println("6.Esci");
            scelta = input.nextLine();
            if(scelta.equals("1")){
                System.out.println("----------------------------------------");
                if(ikea.n == ikea.magazzino.length){
                    System.out.println("Il magazzino è pieno");
                }
                else{
                    System.out.println("Scrivi il codice del prodotto");
                    String codice = input.nextLine();
                    System.out.println("Scrivi il nome del prodotto");
                    String nome = input.nextLine();
                    System.out.println("Scrivi la descrizione del prodotto");
                    String descrizione = input.nextLine();
                    System.out.println("Scrivi la giacenza del prodotto");
                    int giacenza = input.nextInt();
                    System.out.println("Scrivi il prezzo del prodotto");
                    double prezzo = input.nextDouble();
                    ikea.aggiungi(codice, nome, descrizione, giacenza, prezzo);
                }
                System.out.println("----------------------------------------");
            }
            else if(scelta.equals("2")){
                System.out.println("----------------------------------------");
                System.out.println("Scrivi il codice del prodotto che vuoi eliminare");
                String codice = input.nextLine();
                ikea.elimina(codice);
                System.out.println("----------------------------------------");
            }
            else if(scelta.equals("3")){
                System.out.println("----------------------------------------");
                System.out.println("Scrivi il codice del prodotto che vuoi modificare");
                String codice = input.nextLine();
                int esitoRicerca = ikea.ricerca(codice);
                if(esitoRicerca != -1){
                    System.out.println("Scrivi il nome del prodotto");
                    String nome = input.nextLine();
                    System.out.println("Scrivi la descrizione del prodotto");
                    String descrizione = input.nextLine();
                    System.out.println("Scrivi la giacenza del prodotto");
                    int giacenza = input.nextInt();
                    System.out.println("Scrivi il prezzo del prodotto");
                    double prezzo = input.nextDouble();
                    ikea.modifica(codice, nome, descrizione, giacenza, prezzo);
                }
                else{
                    System.out.println("Non esiste un prodotto con tale codice");
                }
                System.out.println("----------------------------------------");

            }
            else if(scelta.equals("4")){
                System.out.println("----------------------------------------");
                System.out.println("Scrivi il codice del prodotto che vuoi stampare");
                String codice = input.nextLine();
                ikea.stampa(codice);
                System.out.println("----------------------------------------");
            }
            else if(scelta.equals("5")){
                ikea.stampaTutti();
            }
        }
    }
}