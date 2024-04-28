public class Prodotto {
    public String codice;
    public String nome;
    public String descrizione;
    public int giacenza;
    public double prezzo;

    public Prodotto(String codice, String nome, String descrizione, int giacenza, double prezzo){
        this.codice = codice;
        this.nome = nome;
        this.descrizione = descrizione;
        this.giacenza = giacenza;
        this.prezzo = prezzo;
    }

    public void stampa(){
        System.out.println("----------------------------------------");
        System.out.println("Codice: " + this.codice);
        System.out.println("Nome: " + this.nome);
        System.out.println("Descrizione: " + this.descrizione);
        System.out.println("Giacenza: " + this.giacenza);
        System.out.println("Prezzo: " + this.prezzo);
        System.out.println("----------------------------------------");
    }

    public String getCodice() {
        return codice;
    }
    public String getNome() {
        return nome;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public int getGiacenza() {
        return giacenza;
    }
    public double getPrezzo() {
        return prezzo;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    public void setGiacenza(int giacenza) {
        this.giacenza = giacenza;
    }
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
}
