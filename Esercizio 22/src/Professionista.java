public abstract class Professionista {
    protected String nome;
    protected String cognome;
    protected int età;

    public Professionista(String nome, String cognome, int età){
        this.nome = nome;
        this.cognome = cognome;
        this.età = età;
    }

    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public int getEtà() {
        return età;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void setEtà(int età) {
        this.età = età;
    }

    public abstract void stampa();
}