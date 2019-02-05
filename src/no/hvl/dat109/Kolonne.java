package no.hvl.dat109;

/*
    @author Herborg Irgens Sjo
 */

public class Kolonne {

    private int kolonneID;
    private int[] kolonne;

    public Kolonne(int ID) {
        kolonneID = ID;
        kolonne = new int[12];
    }

    public void oppdaterVerdi(int runde, int verdi) {
        kolonne[runde-1] = verdi;
    }

    public int getKolonneID() {
        return kolonneID;
    }

    public void setKolonneID(int kolonneID) {
        this.kolonneID = kolonneID;
    }

    public int[] getKolonne() {
        return kolonne;
    }

    public void setKolonne(int[] kolonne) {
        this.kolonne = kolonne;
    }
}


