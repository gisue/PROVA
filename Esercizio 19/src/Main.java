public class Main {
    public static void main(String[] args) {
        //oggetto veicolo
        Veicolo v = new Veicolo("Gianni", "AB738LL", 2002);
        //oggetto auto
        Auto a = new Auto("Giacomo", "BE235HJ", 2012, "Mercedes", "Classe A");
        //oggetto moto
        Moto m = new Moto("Carlo", "DX723ML", 2021, "Kawa", 4);
        //stampo i vari oggetti
        v.stampa();
        System.out.println("--------------------");
        a.stampa();
        System.out.println("--------------------");
        m.stampa();
    }
}