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


import org.example.DaveLevi.Huis.Huis;
import org.junit.jupiter.api.Test;
import org.example.DaveLevi.Adres.Adres;

import java.util.Arrays;

public class HuisOpdracht {

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
    void postcodePrinterTest() {
        char[] testPostcode = {'3', '5', '5', '2', 'a', 'j'};
        Adres mooistraat12 = maakTestAdres();
        System.out.println(mooistraat12.printPostcode(testPostcode));
    }

    @Test
    void tests() {
        char[] testPostcode = {'3', '5', '5', '2', 'a', 'j'};
        //String x = Arrays.toString(testPostcode);
        //System.out.println(x);
        Adres mooistraat12 = maakTestAdres();
        System.out.println(mooistraat12.uitleesHuisAdres());
        //
        Huis voorbeeldHuis = maakTesthuis();
        System.out.println(voorbeeldHuis.uitleesHuis());
        System.out.println(voorbeeldHuis.getHuisAdres().uitleesHuisAdres());
    }

    @Test
    void capaciteitTest(){
        //Coronaregels
        int maxAantalPersonenin1Huis = 12;
        int bezoekerLimiet = 6;
        int capaciteitPerKamer = 2;

        //Voorbeeldhuis Mooistraat 12 aanmaken
        Huis voorbeeldHuis = maakTesthuis();

        //Wijzig deze varibbelen om te test aan te passen
        int bewonersTest =  3;
        int kamersTest =    7;
        voorbeeldHuis.setKamers(bewonersTest);
        voorbeeldHuis.setAantalBewoners(kamersTest);

        int bewoners = voorbeeldHuis.getAantalBewoners();
        int capaciteit = capaciteitPerKamer * voorbeeldHuis.getKamers();
        int maxBezoekers = capaciteit - bewoners;
        if (maxBezoekers > bezoekerLimiet) {
            maxBezoekers = bezoekerLimiet;
        }
        if (bewoners+maxBezoekers > maxAantalPersonenin1Huis) {
            maxBezoekers = maxAantalPersonenin1Huis - bewoners;
        }

        System.out.println("Op " + voorbeeldHuis.getHuisAdres().getStraat() + " " + voorbeeldHuis.getHuisAdres().getHuisnNummer() + " is plek voor maximaal " + capaciteit + " personen.");
        System.out.println("Met de huidige maatregelen mogen er " + maxBezoekers + " personen op bezoek komen");
    }


}






