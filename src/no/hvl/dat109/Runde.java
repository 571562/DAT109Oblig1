package no.hvl.dat109;

/*
    @author Herborg Irgens Sjo
 */

public class Runde {

    private int id;
    private String tekstbeskriving;

    public Runde(int rundeid, String beskriving) {
        id = rundeid;
        tekstbeskriving = beskriving;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTekstbeskriving() {
        return tekstbeskriving;
    }

    public void setTekstbeskriving(String tekstbeskriving) {
        this.tekstbeskriving = tekstbeskriving;
    }
}
