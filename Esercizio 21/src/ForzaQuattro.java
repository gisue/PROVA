public class ForzaQuattro {
    private String[][] schema;
    public ForzaQuattro(String[][] schema){
        this.schema = schema;
    }
    public void stampa(){
        for(int i = 0; i<schema.length; i++){
            for(int j = 0; j<schema[i].length; j++){
                System.out.print("|" + schema[i][j]);
                if(j == schema.length-1){
                    System.out.print("|");
                }
            }
            System.out.println();
            if(i == schema.length-1){
                System.out.print(" ");
                for(int j = 0; j<schema.length; j++){
                    System.out.print((j+1) + " ");
                }
            }
        }
        System.out.println();
    }
    public void utente(int n, String utente){
        for(int i = schema.length-1; i>0; i--){
            if(schema[i][n] == " "){
                schema[i][n] = utente;
                break;
            }
        }
    }
    public boolean vittoria(String utente){
        boolean bool = false;
        //vittoria orizzontale
        for(int i = 0; i<schema.length; i++){
            int contatore = 0;
            for(int j = 0; j<schema[i].length; j++){
                if(schema[i][j].equals(utente)){
                    contatore++;
                }
                else{
                    contatore = 0;
                }
                if(contatore==4){
                    System.out.println("Hai vinto l'utente " + utente);
                    bool = true;
                    break;
                }
            }
        }
        //vittoria verticale
        for(int i = 0; i<schema.length; i++){
            int contatore = 0;
            for(int j = 0; j<schema[i].length; j++){
                if(schema[j][i].equals(utente)){
                    contatore++;
                }
                else{
                    contatore = 0;
                }
                if(contatore==4){
                    System.out.println("Ha vinto l'utente " + utente);
                    bool = true;
                    break;
                }
            }
        }
        //vittoria diagonale
        for(int i = 0; i < schema.length - 3; i++){
            for(int j = 0; j < schema[i].length - 3; j++){
                int contatore = 0;
                for(int k = 0; k < 4; k++){
                    if (schema[i + k][j + k].equals(utente)){
                        contatore++;
                    }
                    else{
                        contatore = 0;
                    }
                    if(contatore == 4){
                        System.out.println("Ha vinto l'utente " + utente);
                        bool = true;
                        break;
                    }
                }
            }
        }
        for(int i = 3; i < schema.length; i++){
            for(int j = 0; j < schema[i].length - 3; j++){
                int contatore = 0;
                for(int k = 0; k < 4; k++){
                    if(schema[i - k][j + k].equals(utente)){
                        contatore++;
                    }
                    else{
                        contatore = 0;
                    }
                    if(contatore == 4){
                        System.out.println("Ha vinto l'utente " + utente);
                        bool = true;
                        break;
                    }
                }
            }
        }
        return bool;
    }

    public String[][] getSchema() {
        return schema;
    }

    public void setSchema(String[][] schema) {
        this.schema = schema;
    }
}