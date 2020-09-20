package org.example.DaveLevi.Adres;

import org.assertj.core.util.VisibleForTesting;

public class Adres {
    private long huisID;
    private String straat;
    private int huisNummer;
    private String stad;
    private char[] postcode;

    public long getHuisID(){
        return huisID;
    }
    public String getStraat() {
        return straat;
    }
    public int getHuisnNummer(){
        return huisNummer;
    }
    public String getStad(){
        return stad;
    }
    public char[] getPostcode(){
        return postcode;
    }
    public Adres(long newHuisID, String newStraat, int newHuisnummer, String newStad, char[] newPostcode) {
        setHuisID(newHuisID);
        setStraat(newStraat);
        setHuisnummer(newHuisnummer);
        setStad(newStad);
        setPostcode(newPostcode);

    }
    public void setHuisID(long setHuisID){
        huisID = setHuisID;
    }
    public void setStraat(String setStraat){
        straat = setStraat;
    }
    public void setHuisnummer(int newHuisNummer){
        huisNummer = newHuisNummer;
    }
    public void setStad(String newStad){
        stad = newStad;
    }
    public void setPostcode(char[] newPostcode){
        postcode = newPostcode;
    }

    public String uitleesHuisAdres(){
        return "Huis ID = " + huisID + ". Adres = " + straat + " " + huisNummer + ", " + printPostcode(postcode) + " " + stad;
    }

    public String printPostcode(char [] postcode){
        String x = "";
        for (int i = 0; i < postcode.length; i++){
            x = x + postcode[i];
        }

        return x;
    }
}
