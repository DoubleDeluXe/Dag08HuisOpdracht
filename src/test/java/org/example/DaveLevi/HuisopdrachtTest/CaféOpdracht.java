package org.example.DaveLevi.HuisopdrachtTest;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class CaféOpdracht {
        /*
    het concept, een café waar mensen biertjes komen halen.
    er mogen x aantal mensen tegelijk binnen zijn.
    we moeten bijhouden wanneer er mensen bijkomen of weggaan.
    classes: Cafe, groep personen(variable groote), elke bezoeker heeft zin in bier.
    als een bezoeker geen zin meer heeft in bier gaat hij/zij weg.
    waarschijnlijk een te abitieus idee maar we beginnen gewoon tot het te complex wordt!
     */
    @Test
    void maakRandomGroepen(){
        Scanner eye = new Scanner(System.in);

        welkom();
        int capaciteit = vraagCaféCapaciteit();

        int maxGroepGroote = vraagDeGroepsGroote(capaciteit);
        fancyLine();

        Groep groep1 = new Groep(randomGroepGroote(maxGroepGroote), 3);
        printDeAankomst(groep1);
        capaciteit = berekenOfDeGroepPast(capaciteit, groep1.getGroepGroote());
        //pastDeGroep(capaciteit);

        Groep groep2 = new Groep(randomGroepGroote(maxGroepGroote), 3);
        printDeAankomst(groep2);
        capaciteit = berekenOfDeGroepPast(capaciteit, groep2.getGroepGroote());
        //pastDeGroep(capaciteit);

        Groep groep3 = new Groep(randomGroepGroote(maxGroepGroote), 3);
        printDeAankomst(groep3);
        capaciteit = berekenOfDeGroepPast(capaciteit, groep3.getGroepGroote());
        //pastDeGroep(capaciteit);

        Groep groep4 = new Groep(randomGroepGroote(maxGroepGroote), 3);
        printDeAankomst(groep4);
        capaciteit = berekenOfDeGroepPast(capaciteit, groep4.getGroepGroote());
        //pastDeGroep(capaciteit);

        Groep groep5 = new Groep(randomGroepGroote(maxGroepGroote), 3);
        printDeAankomst(groep5);
        capaciteit = berekenOfDeGroepPast(capaciteit, groep5.getGroepGroote());
        //pastDeGroep(capaciteit);
    }

    int randomGroepGroote(int groote){
        return (int) (Math.random()*groote+1);
    }

    void welkom(){
        fancyLine();
        System.out.println("Welkom bij café Valence!");
        fancyLine();
        newline();
    }
    void fancyLine(){
        System.out.println("~-=~-=~-=~-=~-=~-=~-=~-=");
    }

    int vraagCaféCapaciteit(){
        Scanner eye = new Scanner(System.in);
        System.out.println("Hoeveel gasten passen er in het café?");
        newline();
        return eye.nextInt();
    }

    int vraagDeGroepsGroote(int x){
        Scanner eye = new Scanner(System.in);
        System.out.println("Om de capaciteit van "+ x + " gasten te testen gaan we 5 test-groepen aanmaken.");
        System.out.println("Geef een maximale groepsgroote op");
        newline();
        return eye.nextInt();
    }

    void printDeAankomst(Groep x){
        if ((x.getGroepGroote()) == 1) {
            System.out.println("Er arriveert " + x.getGroepGroote() + " gast");
        } else {
            System.out.println("Er arriveert een groep van " + x.getGroepGroote() + " gasten");
        }
    }

    void pastDeGroep(int x){
        if (x > 0) {
            System.out.println("De groep kan aanschuiven en besteld een biertje");
            System.out.println("Op dit moment zijn er nog " + x + " plaatsen beschikbaar");
            newline();
        } else {
            System.out.println("Helaas er is geen plek meer in het café voor deze groep!");
            newline();
        }
    }
    int berekenOfDeGroepPast(int x, int y) {
        if (x >= y){
            if (y == 1) {
                System.out.println("De gast kan aanschuiven en besteld een biertje");
            } else {
                System.out.println("De groep kan aanschuiven en besteld een biertje");
            }
            System.out.println("Nog " + (x-y) + " plaatsen beschikbaar");
            newline();
            return x-y;
        } else {
            System.out.println("Helaas er is geen plek meer in het café voor deze groep!");
            newline();
            return x;
        }
    }
    void newline(){
        System.out.println();
    }
}
