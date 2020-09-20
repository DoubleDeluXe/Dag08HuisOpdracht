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
        Huis voorbeeldHuis = maakTesthuis();
        int bewoners = voorbeeldHuis.getAantalBewoners();
        int capciteit = voorbeeldHuis.getKamers();


    }


}






