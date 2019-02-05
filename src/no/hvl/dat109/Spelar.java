package no.hvl.dat109;


/*
    @author Herborg Irgens Sjo
 */
public class Spelar {

    private String namn;
    public Kolonne kolonne;
    private int poengscore;

    public Spelar(String namn) {
        this.namn = namn;
        this.poengscore = 0;

    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public Kolonne getKolonne() {
        return kolonne;
    }

    public void setKolonne(Kolonne kolonne) {
        this.kolonne = kolonne;
    }

    public int getPoengscore() {
        return poengscore;
    }

    public void setPoengscore(int poengscore) {
        this.poengscore = poengscore;
    }
}
