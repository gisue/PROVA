public class Ingegnere extends Professionista{
    private String cantiere;

    public Ingegnere(String nome, String cognome, int età, String cantiere){
        super(nome, cognome, età);
        this.cantiere = cantiere;
    }

    public String getCantiere() {
        return cantiere;
    }
    public void setCantiere(String cantiere) {
        this.cantiere = cantiere;
    }

    @Override
    public void stampa() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cognome: " + this.cognome);
        System.out.println("Età: " + this.età);
        System.out.println("Cantiere: " + this.cantiere);
    }
}