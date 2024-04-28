import java.util.Scanner;
class Persona {
    public String nome;
    public String cognome;
    public int età;
    public String cf;

    public Persona(String cf, String nome, String cognome, int età){
        this.cf = cf;
        this.nome = nome;
        this.cognome = cognome;
        this.età = età;
    }

    public void stampa(){
        System.out.println("CF: " + this.cf);
        System.out.println("Nome: " + this.nome);
        System.out.println("Cognome: " + this.cognome);
        System.out.println("Età: " + this.età);
    }

    public String getCf() {
        return cf;
    }
    public String getNome(){
        return this.nome;
    }
    public String getCognome(){
        return this.cognome;
    }
    public int getEtà(){
        return this.età;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }
    public String setNome(String nome){
        return this.nome = nome;
    }
    public String setCognome(String cognome){
        return this.cognome = cognome;
    }
    public int setEtà(int età){
        return this.età = età;
    }
}