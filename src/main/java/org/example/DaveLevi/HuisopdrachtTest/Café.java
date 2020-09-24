package org.example.DaveLevi.HuisopdrachtTest;

    /*
    het concept, een café waar mensen biertjes komen halen.
    er mogen x aantal mensen tegelijk binnen zijn.
    we moeten bijhouden wanneer er mensen bijkomen of weggaan.
    classes: Cafe, groep personen(variable groote), elke bezoeker heeft zin in bier.
    als een bezoeker geen zin meer heeft in bier gaat hij/zij weg.
    waarschijnlijk een te abitieus idee maar we beginnen gewoon tot het te complex wordt!
     */

public class Café {
    private String naam;
    private int capaciteit;

    public Café(String naam, int capaciteit) {
        this.naam = naam;
        this.capaciteit = capaciteit;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getCapaciteit() {
        return capaciteit;
    }

    public void setCapaciteit(int capaciteit) {
        this.capaciteit = capaciteit;
    }

    public String toString() {
        return "Café{" +
                "naam='" + naam + '\'' +
                ", capaciteit=" + capaciteit +
                '}';
    }
}
