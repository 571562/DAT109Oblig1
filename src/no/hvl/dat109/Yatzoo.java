package no.hvl.dat109;

import java.util.ArrayList;
import java.util.Scanner;

public class Yatzoo {

    private int runde;
    public Terning terning;
    public ArrayList<Dyr> terningresultat;
    private Scanner reader = new Scanner(System.in);

    public Yatzoo() {
        runde = 0;
        terning = new Terning();
        terningresultat = new ArrayList<Dyr>();
    }

    public void kastTerning() {
        boolean ferdig = false;
        int count = 0;
        int antal = 5;

        while(!ferdig && count !=3) {
            for(int i = 0; i < antal; i++) {
                Dyr dyr = terning.TrillTerning();
                terningresultat.add(dyr);
            }
            System.out.println("n\Dine terningkast: ");
            for(int i = 1; i < 6; i++) {
                System.out.println(i + ".\t" + terningresultat.get(i-1));
            }
            if(count != 2) {
                System.out.println("Skriv inn tala på terninange du vil ha: ");
                String input = reader.nextLine();
                String[] inputTab = input.split("\\s");
                ArrayList<Dyr> midlertidig = new ArrayList<Dyr>();

                for(int i = 0; i < inputTab.length; i++) {
                    midlertidig.add(terningresultat.get(Integer.parseInt(inputTab[i]) - 1));
                }
                terningresultat = midlertidig;
            }
            antal = 5 - terningresultat.size();
            if(antal == 0) {
                ferdig = true;
            }
            count++;
        }
    }
}