package no.hvl.dat109;

public class Terning {

    public Dyr[] terning;

    private Dyr løve = new Dyr("Løve", "oransje", 1);
    private Dyr slange = new Dyr("Slange", "grønn", 2);
    private Dyr panda = new Dyr("Panda", "svart", 3);
    private Dyr gris = new Dyr("Gris", "rosa", 4);
    private Dyr elefant = new Dyr("Elefant", "grå", 5);
    private Dyr hval = new Dyr("Hval", "blå", 6);


    public Terning() {
        terning = new Dyr[6];
        terning[0] = løve;
        terning[1] = slange;
        terning[2] = panda;
        terning[3] = gris;
        terning[4] = elefant;
        terning[5] = hval;

    }


}
