public class Adres {

    private String adres;
    private int numer;

    public Adres() {
    }

    public Adres(String adres, int numer) {
        this.adres = adres;
        this.numer = numer;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    @Override
    public String toString(){
        return this.adres + "; Numer telefonu: " + this.numer;
    }
}
