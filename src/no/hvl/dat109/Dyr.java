package no.hvl.dat109;

/*
    @author Herborg Irgens Sjo
 */

public class Dyr {

    private String namn;
    private String farge;
    private int id;

    public Dyr(String namn, String farge, int id) {
        super();
        this.namn = namn;
        this.farge = farge;
        this.id = id;
    }

    public String getNamn() {
        return namn;
    }

    public String getFarge() {
        return farge;
    }

    public int getId() {
        return id;
    }

    }
