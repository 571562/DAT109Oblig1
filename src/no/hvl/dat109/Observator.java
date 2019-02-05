package no.hvl.dat109;

import java.util.Scanner;

public class Observator {

    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);
        System.out.println("\nKor mange spelarar? (Maks 5)");
        int antSpelarar = Integer.parseInt(tastatur.nextLine());
        Spelar[] spelarar = new Spelar[antSpelarar];

        for (int i = 0; i < antSpelarar; i++) {
            System.out.print("\nNamn på spelar " + (i+1) + ":\t");
            String navn = tastatur.nextLine();
            Spelar spelar = new Spelar(navn);
            spelarar[i] = spelar;
        }

        Yatzoo yatzoo = new Yatzoo(spelarar);

        try {
            System.out.println("\nKor mange runder? (Maks 12)");
            int runde = Integer.parseInt(tastatur.nextLine());
            yatzoo.spel(runde);
        } catch (Exception e) {
            System.out.println("-----Dette er utilsiktet bruk-----");
            e.printStackTrace();
        }
        tastatur.close();
    }
}
