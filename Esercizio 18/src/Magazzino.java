class Magazzino {
    //Creo l'array contenente i prodotti del magazzino
    public Prodotto[] magazzino;
    public int n;

    public Magazzino(int nMax){
        this.magazzino = new Prodotto[nMax];
        this.n = 0;
    }

    //RICERCA
    public int ricerca(String codice){
        for(int i = 0; i<n; i++){
            if(this.magazzino[i].getCodice().equals(codice)){
                //il prodotto è presente in posizione i
                return i;
            }
        }
        return -1;
    }

    //AGGIUNGI
    public boolean aggiungi(String codice, String nome, String descrizione, int giacenza, double prezzo){
        int esitoRicerca = ricerca(codice);
        if(n == magazzino.length){
            System.out.println("Il magazzino è pieno");
            return false;
        }
        if(esitoRicerca != -1){
            System.out.println("Il prodotto esiste già");
            return false;
        }
        Prodotto p = new Prodotto(codice, nome, descrizione, giacenza, prezzo);
        this.magazzino[n] = p;
        n++;
        return true;
    }

    //ELIMINA
    public void elimina(String codice){
        int esitoRicerca = ricerca(codice);
        if(esitoRicerca != -1){
            this.magazzino[esitoRicerca] = this.magazzino[n-1];
            this.magazzino[n-1] = null;
            n--;
        }
        else{
            System.out.println("Non esiste un prodotto con tale codice");
        }
    }

    //MODIFICA
    public void modifica(String codice, String nome, String descrizione, int giacenza, double prezzo){
        int esitoRicerca = ricerca(codice);
        if(esitoRicerca != -1){
            magazzino[esitoRicerca].setNome(nome);
            magazzino[esitoRicerca].setDescrizione(descrizione);
            magazzino[esitoRicerca].setGiacenza(giacenza);
            magazzino[esitoRicerca].setPrezzo(prezzo);
        }
        else{
            System.out.println("Non esiste un prodotto con tale codice");
        }
    }

    //STAMPA
    public void stampa(String codice){
        int esitoRicerca = ricerca(codice);
        if(esitoRicerca != -1){
            this.magazzino[esitoRicerca].stampa();
        }
        else{
            System.out.println("Non esiste un prodotto con tale codice");
        }
    }

    //STAMPA TUTTI
    public void stampaTutti(){
        for(int i = 0; i<n; i++){
            this.magazzino[i].stampa();
        }
    }
}