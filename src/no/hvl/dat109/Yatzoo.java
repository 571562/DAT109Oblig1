package no.hvl.dat109;

import java.util.ArrayList;
import java.util.Scanner;

public class Yatzoo {

    private int runde;
    public Terning terning;
    public ArrayList<Dyr> terningresultat;
    private Scanner reader = new Scanner(System.in);
    private Brett blokk;
    public Spelar[] spelarar;

    public Yatzoo(Spelar[] spelarar) {
        runde = 1;
        terning = new Terning();
        terningresultat = new ArrayList<Dyr>();
        blokk = new Brett(spelarar);
        this.spelarar = spelarar;
    }

    public void spel(int i) {
        while (runde <= i) {
            spelRunde();
        }

        for (Spelar s : spelarar) {
            summerPoeng(s);
        }
        finnVinner();
    }

    public void spelRunde() {
        for (Spelar spiller : spelarar) {
            System.out.println("\n" + spiller.getNamn() + " sin tur."
                    + "\nDenne runden skal du ha " + blokk.getRad().getRad()[runde-1].getTekstbeskriving());
            kastTerning();
            int resultat = blokk.getRad().rundeSjekk(runde, terningresultat);
            spiller.getKolonne().oppdaterVerdi(runde, resultat);
            terningresultat.clear();
        }
        runde++;
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
            System.out.println("\nDine terningkast: ");
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

    public void summerPoeng(Spelar spelarar) {
        int sum = 0;
        for (int i : spelarar.getKolonne().getKolonne()) {
            sum += i;
        }
        spelarar.setPoengscore(sum);
    }

    public void finnVinner() {
        boolean flereVinnere = false;
        Spelar vinner = spelarar[0];
        ArrayList<Spelar> vinnere = new ArrayList<Spelar>();
        vinnere.add(vinner);
        for (int i = 1; i < spelarar.length; i++) {
            if (spelarar[i].getPoengscore() > vinner.getPoengscore()) {
                vinner = spelarar[i];
                if (flereVinnere) {
                    flereVinnere = false;
                    vinnere.clear();
                }

            } else if (spelarar[i].getPoengscore() == vinner.getPoengscore()) {
                flereVinnere = true;
                vinnere.add(spelarar[i]);
            }

        }

        System.out.println("\nResultatliste:");

        for (Spelar s : spelarar) {
            System.out.println(s.getNamn() + "\t:\t" + s.getPoengscore() + "p");
        }
        if (flereVinnere) {
            System.out.print("\nDet er fleire spelarar med like stor poengsum som delar 1. plassen.\nGratulerar");
            for (Spelar s : vinnere) {
                System.out.print("  " + s.getNamn());
            }
            System.out.println("!");
        } else {
            System.out.println("Gratulerar " + vinner.getNamn() + "! Du har vunnet spelet!");
        }
    }

    public int getRunde() {
        return runde;
    }

    public ArrayList<Dyr> getTerningkast() {
        return terningresultat;
    }

    public Brett getBlokk() {
        return blokk;
    }








}