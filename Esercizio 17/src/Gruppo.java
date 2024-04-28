class Gruppo {
    public Persona[] gruppo;
    //array di Persona (cioè un array di oggetti), ogni elementi è un oggetto della classe Persona
    public int n; //numero di persone
    public Gruppo(int nMax){
        //all'inizio non ho Persone
        //l'array è vuoto
        this.gruppo = new Persona[nMax];
        this.n = 0;
    }

    //ricerca di una Persona in base al cf
    //o restituisce un boolean, o restituisce un int
    //cioè la posizione nell'array, -1 se non c'è
    public int ricerca(String cf){
        for(int i = 0; i<n; i++){
            if(this.gruppo[i].getCf().equals(cf)){
                return i;
                //l'ho trovato
            }
        }
        return -1;
    }

    //AGGIUNGI PERSONA
    //posso aggiungere se l'array non è pieno e se la persona non c'è già
    //o passo una Persona oppure passo i singoli valori degli attributi
    public boolean aggiungi(String cf, String nome, String cognome, int età){
        //creo la persona
        if(this.n == gruppo.length){
            System.out.println("Il gruppo è pieno");
            return false;
            //l'array pieno
        }
        if(ricerca(cf)!=-1){
            //la persona c'è già
            System.out.println("La persona esiste già");
            return false;
        }
        Persona p = new Persona(cf, nome, cognome, età);
        //aggiungo la persona nel primo elemento libero
        this.gruppo[n] = p;
        n++;
        return true;
    }

    //altri metodi: stampa, stampaTutti, elimina
    public void stampa(String cf){
        int esitoRicerca = ricerca(cf);
        if(esitoRicerca != -1){
            //esiste
            this.gruppo[esitoRicerca].stampa();
        }
        else{
            System.out.println("La persona con non esiste");
        }
    }
    public void stampaTutti(){
        if(n == 0){
            System.out.println("Non ci sono persone");
        }
        else{
            for(int i = 0; i<n; i++){
                this.gruppo[i].stampa();
                System.out.println();
            }
        }
    }
    //modifico gli attributi di una Persona (in base al cf)
    //in alternativa fare più metodi che modificano i singoli attributi
    public boolean modifica(String cf, String nome, String cognome){
        int esitoRicerca = ricerca(cf);
        if(esitoRicerca != -1){
            //esiste
            this.gruppo[esitoRicerca].setNome(nome);
            this.gruppo[esitoRicerca].setCognome(cognome);
        }
        else{
            System.out.println("La persona non esiste");
            return false;
        }
        return true;
    }

    //elimina una Persona(in base al cf)
    public boolean elimina(String cf){
        int esitoRicerca = ricerca(cf);
        if(esitoRicerca != -1){
            this.gruppo[esitoRicerca] = this.gruppo[n-1];
            this.gruppo[n-1] = null;
            n--;
        }
        else{
            System.out.println("La persona non esiste");
            return false;
        }
        return true;
    }
}