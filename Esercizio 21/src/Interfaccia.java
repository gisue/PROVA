import java.util.Scanner;

public class Interfaccia {
    private ForzaQuattro forzaQuattro;
    public Interfaccia(ForzaQuattro forzaQuattro){
        this.forzaQuattro = forzaQuattro;
    }

    public void start(){
        Scanner input = new Scanner(System.in);
        System.out.println("-------------");
        System.out.println("FORZA-QUATTRO");
        System.out.println("-------------");

        for(int i = 0; i< forzaQuattro.getSchema().length; i++){
            for(int j = 0; j< forzaQuattro.getSchema()[i].length; j++){
                forzaQuattro.getSchema()[i][j] = " ";
            }
        }
        forzaQuattro.stampa();

        String utente = "x";
        boolean vitt = false;
        while(!vitt){
            System.out.print("Turno di " + utente + ": ");
            int n = input.nextInt();
            forzaQuattro.utente((n-1), utente);
            forzaQuattro.stampa();

            vitt = forzaQuattro.vittoria(utente);

            if(utente.equals("x")){utente = "o";}
            else{utente = "x";}
        }
    }
}