package org.example.DaveLevi.HuisopdrachtTest;

public class Groep {
    private int groepGroote;
    private int zinInBier;

    public Groep(int groepGroote, int zinInBier) {
    }

    public int getGroepGroote() {
        return groepGroote;
    }

    public void setGroepGroote(int groepGroote) {
        this.groepGroote = groepGroote;
    }

    public int getZinInBier() {
        return zinInBier;
    }

    public void setZinInBier(int zinInBier) {
        this.zinInBier = zinInBier;
    }

    @Override
    public String toString() {
        return "Groep{" +
                "groepGroote=" + groepGroote +
                ", zinInBier=" + zinInBier +
                '}';
    }
}
