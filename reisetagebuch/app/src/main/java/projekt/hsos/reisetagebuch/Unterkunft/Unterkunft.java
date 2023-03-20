package projekt.hsos.reisetagebuch.Unterkunft;

import projekt.hsos.reisetagebuch.Datum.Datum;
import projekt.hsos.reisetagebuch.Entitaet.Ort;

public class Unterkunft {
    private String name;
    private int preis;
    private double bewertungSelber;

    private Ort ort;
    private Datum datumVon, datumBis;

    public Unterkunft(String name){
        this.name = name;
    }

    public Unterkunft(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public double getBewertungSelber() {
        return bewertungSelber;
    }

    public void setBewertungSelber(double bewertungSelber) {
        this.bewertungSelber = bewertungSelber;
    }

    public Ort getOrt() {
        return ort;
    }

    public void setOrt(Ort ort) {
        this.ort = ort;
    }

    public Datum getDatumVon() {
        return datumVon;
    }

    public void setDatumVon(Datum datumVon) {
        this.datumVon = datumVon;
    }

    public Datum getDatumBis() {
        return datumBis;
    }

    public void setDatumBis(Datum datumBis) {
        this.datumBis = datumBis;
    }
}
