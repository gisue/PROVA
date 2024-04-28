public class Moto extends Veicolo{
    private String marca;
    private int tempi;

    //OVERLOADING DEL COSTRUTTORE
    public Moto(String proprietario, String targa, int anno,String marca, int tempi) {
        super(proprietario, targa, anno);
        this.marca = marca;
        this.tempi = tempi;
    }
    public Moto(String proprietario, String targa, int anno) {
        super(proprietario, targa, anno);
    }

    @Override
    public void stampa(){
        System.out.println("MOTO");
        super.stampa();
        System.out.println("Tempi: " + this.tempi);
    }
}