package org.example.DaveLevi.Huis;

import org.example.DaveLevi.Adres.Adres;

public class Huis {
    private long huisID;
    Adres huisAdres;
    private int kamers;
    private int aantalBewoners;

    public Huis() {
        setAantalBewoners(1);
        setKamers(1);
    }

    public Huis(long newHuisID, Adres newHuisAdres, int newAantalBewoners, int newKamers){
        setHuisID(newHuisID);
        setHuisAdres(newHuisAdres);
        setAantalBewoners(newAantalBewoners);
        setKamers(newKamers);
    }

    public long getHuisID(){
        return huisID;
    }
    public void setHuisID(long setHuisID){
        huisID = setHuisID;
    }
    public Adres getHuisAdres(){
        return huisAdres;
    }
    public void setHuisAdres(Adres newHuisAdres){
        huisAdres = newHuisAdres;
    }
    public int getKamers() {
        return kamers;
    }
    public void setKamers(int newKamers) {
        kamers = newKamers;
    }
    public int getAantalBewoners() {
        return aantalBewoners;
    }

    public void setAantalBewoners(int aantalBewoners) {
        this.aantalBewoners = aantalBewoners;
    }

    public String uitleesHuis(){
        return "HuisID = " + huisID + ". Aantal bewoners = " + aantalBewoners + ". Aantal kamers = " + kamers + ".";
    }


}
