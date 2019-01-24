package no.hvl.dat109;

public class Terning {

    public Dyr[] terning;

    private Dyr lion = new Dyr("Løve", "oransje", 1);
    private Dyr snake = new Dyr("Slange", "grønn", 2);
    private Dyr panda = new Dyr("Panda", "svart", 3);
    private Dyr pig = new Dyr("Gris", "rosa", 4);
    private Dyr elephant = new Dyr("Elefant", "grå", 5);
    private Dyr whale = new Dyr("Hval", "blå", 6);


    public Terning() {

        terning = new Dyr[6];
        terning[0] = lion;
        terning[1] = snake;
        terning[2] = panda;
        terning[3] = pig;
        terning[4] = elephant;
        terning[5] = whale;


    }


}
