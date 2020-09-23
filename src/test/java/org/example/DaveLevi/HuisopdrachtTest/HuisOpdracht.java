package org.example.DaveLevi.HuisopdrachtTest;

/*
Context opdracht = corona
max 6 andere personen in de woning
bestaat uit,
HUIS:   adres huis*
        int aantalkamers
        Methodes
        verantwoordelijkheid

PERSOON: naam
        leeftijd
        get/setters

ADRES:  Straat
        huisnummer
        stad
        postcode
        land

BOA OBJECT: Iets wat kijkt wanneer je over capaciteit bent

 */

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class HuisOpdracht {

    @Test
    int randomGroepGroote(int groote){
        return (int) (Math.random()*groote+1);
    }

    @Test
    void maakRandomGroepen(){
        Scanner eye = new Scanner(System.in);
        System.out.println("wat is de maximale groepsgroote?");
        int maxGroepGroote = eye.nextInt();
        Groep groep1 = new Groep(randomGroepGroote(maxGroepGroote), 3);
        Groep groep2 = new Groep(randomGroepGroote(maxGroepGroote), 3);
        Groep groep3 = new Groep(randomGroepGroote(maxGroepGroote), 3);
        Groep groep4 = new Groep(randomGroepGroote(maxGroepGroote), 3);
        Groep groep5 = new Groep(randomGroepGroote(maxGroepGroote), 3);

    }
    }

    void gastenManager(){

    }
    /*
==================================================================
     */

    @Test
    Adres maakTestAdres(){
        char[] testPostcode = {'3', '5', '5', '2', 'a', 'j'};
        //String x = Arrays.toString(testPostcode);
        //System.out.println(x);
        Adres mooistraat12 = new Adres(1, "Mooistraat", 12, "Zwolle", testPostcode);
        return mooistraat12;
    }

    @Test
    Huis maakTesthuis(){
        Adres mooistraat12 = maakTestAdres();
        Huis voorbeeldHuis = new Huis(1, mooistraat12, 3, 7);
        return voorbeeldHuis;
    }

    @Test
    void testPostcodePrinter() {
        char[] testPostcode = {'3', '5', '5', '2', 'a', 'j'};
        Adres mooistraat12 = maakTestAdres();
        System.out.println(mooistraat12.printPostcode(testPostcode));
    }

    @Test
    void koppelAdresAanHuis() {
        //char[] testPostcode = {'3', '5', '5', '2', 'a', 'j'};
        //String x = Arrays.toString(testPostcode);
        //System.out.println(x);
        Adres mooistraat12 = maakTestAdres();
        System.out.println(mooistraat12.ToString());
        //
        Huis voorbeeldHuis = maakTesthuis();
        System.out.println(voorbeeldHuis.uitleesHuis());
        System.out.println(voorbeeldHuis.getAdres().ToString());
    }

    @Test
    void defineerCapaciteitBezoekersMetCoronaregels(){
        //Coronaregels
        int regelAantalPersonenin1Huis = 8;
        int regelBezoekerlimiet = 6;
        int regelCapaciteitPerKamer = 2;

        //Wijzig deze varibbelen om het testhuis aan te passen
        int bewonersTest = 3;
        int kamersTest = 7;

        //Test
        Huis voorbeeldHuis = maakTesthuis();
        voorbeeldHuis.setKamers(kamersTest);
        voorbeeldHuis.setAantalBewoners(bewonersTest);
        int bewoners = voorbeeldHuis.getAantalBewoners();
        int capaciteit = regelCapaciteitPerKamer * voorbeeldHuis.getKamers();
        int maxBezoekers = capaciteit - bewoners;
        if (maxBezoekers > regelBezoekerlimiet) {
            maxBezoekers = regelBezoekerlimiet;
        }
        if (bewoners + maxBezoekers > regelAantalPersonenin1Huis) {
            maxBezoekers = regelAantalPersonenin1Huis - bewoners;
        }
        System.out.println("Op " + voorbeeldHuis.getAdres().getStraat() + " " +
                voorbeeldHuis.getAdres().getHuisnNummer() + " is plek voor maximaal " + capaciteit + " personen.");
        System.out.println("Met de huidige maatregelen mogen er " + maxBezoekers + " personen op bezoek komen");
    }


}






