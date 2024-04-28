public class Architetto extends Professionista{
    private String opera;

    public Architetto(String nome, String cognome, int età, String opera){
        super(nome, cognome, età);
        this.opera = opera;
    }

    public String getOpera() {
        return opera;
    }
    public void setOpera(String opera) {
        this.opera = opera;
    }

    @Override
    public void stampa() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cognome: " + this.cognome);
        System.out.println("Età: " + this.età);
        System.out.println("Opera: " + this.opera);
    }
}