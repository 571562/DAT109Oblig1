package no.hvl.dat109;

import java.util.Random;

/*
    @author Herborg Irgens Sjo
 */

public class Terning {

    public Dyr[] terning;

    private Dyr lion = new Dyr("Løve", "Oransje", 1);
    private Dyr snake = new Dyr("Slange", "Grøn", 2);
    private Dyr panda = new Dyr("Panda", "Svart", 3);
    private Dyr pig = new Dyr("Gris", "Rosa", 4);
    private Dyr elephant = new Dyr("Elefant", "Grå", 5);
    private Dyr whale = new Dyr("Hval", "Blå", 6);


    public Terning() {

        terning = new Dyr[6];
        terning[0] = lion;
        terning[1] = snake;
        terning[2] = panda;
        terning[3] = pig;
        terning[4] = elephant;
        terning[5] = whale;

    }

    public Dyr TrillTerning () {
        Random ran = new Random();
        int resultat = ran.nextInt(6);
        return terning[resultat];
    }

}
