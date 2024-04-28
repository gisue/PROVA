import java.util.Random;
import java.util.Scanner;

public class Mastermind{
    private char[] alfa;
    private int tentativi;
    private int n; //lunghezza parola
    public Mastermind(char[] alfa, int tentativi, int n){
        this.alfa = alfa;
        this.tentativi = tentativi;
        this.n = n;
    }

    public char[] generaParola(){
        Random rand = new Random();
        char[] parola = new char[this.n];
        for(int i = 0; i<this.n; i++){
            parola[i] = this.alfa[rand.nextInt(this.alfa.length)];
        }
        return parola;
    }

    public char[] generaTentativo(){
        Scanner input = new Scanner(System.in);
        char[] tentativo = new char[this.n];
        for(int i = 0; i<this.n; i++){
            System.out.print("Scrivi il carattere " + (i+1) + ": ");
            char carattere = input.nextLine().charAt(0);
            tentativo[i] = carattere;
        }
        return tentativo;
    }

    public boolean indovinato(char[] parola, char[] tentativo){
        boolean indovinato = true;
        for(int i = 0; i<this.n; i++){
            if(parola[i]==tentativo[i]){
                System.out.println("La lettera " + tentativo[i] + " è nella posizione corretta ed è presente ");
            }
            else if(letteraPresente(parola, tentativo[i])){
                System.out.println("La lettera " + tentativo[i] + " è nella posizione sbagliata ed è presente ");
                indovinato = false;
            }
            else if(parola[i]!=tentativo[i]){
                System.out.println("La lettera " + tentativo[i] + " non è presente");
                indovinato = false;
            }
        }
        return indovinato;
    }

    public boolean letteraPresente(char[] parola, char carattere){
        for(char c : parola){
            if(c==carattere){
                return true;
            }
        }
        return false;
    }

    public int getN() {
        return n;
    }
    public int getTentativi() {
        return tentativi;
    }
    public char[] getAlfa() {
        return alfa;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void setTentativi(int tentativi) {
        this.tentativi = tentativi;
    }
    public void setAlfa(char[] alfa) {
        this.alfa = alfa;
    }
}