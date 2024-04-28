public class Veicolo {
    protected String proprietario;
    protected String targa;
    protected int anno;

    public Veicolo(String proprietario, String targa, int anno){
        this.proprietario = proprietario;
        this.targa = targa;
        this.anno = anno;
    }

    public void stampa(){
        System.out.println("Proprietario: " + this.proprietario);
        System.out.println("Targa: " + this.targa);
        System.out.println("Anno: " + this.anno);
    }
    public String getProprietario() {
        return proprietario;
    }
    public String getTarga() {
        return targa;
    }
    public int getAnno() {
        return anno;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
    public void setTarga(String targa) {
        this.targa = targa;
    }
    public void setAnno(int anno) {
        this.anno = anno;
    }
}