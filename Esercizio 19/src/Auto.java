public class Auto extends Veicolo{
    private String marca;
    private String modello;

    //OVERLOADING DEL COSTRUTTORE
    public Auto(String proprietario, String targa, int anno, String marca, String modello) {
        super(proprietario, targa, anno);
        this.marca = marca;
        this.modello = modello;
    }
    public Auto(String proprietario, String targa, int anno) {
        super(proprietario, targa, anno);
    }

    @Override
    public void stampa(){
        System.out.println("AUTOMOBILE");
        super.stampa();
        System.out.println("Marca: " + this.marca);
        System.out.println("Modello: " + this.modello);
    }
}