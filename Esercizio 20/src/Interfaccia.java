public class Interfaccia{
    private Mastermind mastermind;

    public Interfaccia(Mastermind mastermind){
        this.mastermind = mastermind;
    }

    public void start(){
        System.out.println("--------------------");
        System.out.println("-----MASTERMIND-----");
        System.out.println("--------------------");
        char[] parola = mastermind.generaParola();

        boolean gioco = true;
        int i = 0;
        while(i< mastermind.getTentativi() && gioco){
            System.out.println("TENTATIVO " + (i+1));
            char[] tentativo = mastermind.generaTentativo();
            if(mastermind.indovinato(parola, tentativo)){
                System.out.println("HAI INDOVINATO!");
                gioco = false;
            }
            else if((i+1)== mastermind.getTentativi()){
                System.out.println("NON HAI INDOVINATO E HAI FINITO I TUOI TENTATIVI!!");
                System.out.print("La parola era: ");
                for(int j = 0; j< mastermind.getN(); j++){
                    System.out.print(parola[j]);
                }
            }
            else{
                System.out.println("NON HAI INDOVINATO!!");
            }
            System.out.println("--------------------");
            i++;
        }
    }
}