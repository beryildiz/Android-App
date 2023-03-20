package projekt.hsos.reisetagebuch.Reise;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;

import projekt.hsos.reisetagebuch.Datum.Datum;
import projekt.hsos.reisetagebuch.Entitaet.Anreisemittel;
import projekt.hsos.reisetagebuch.Entitaet.Ort;
import projekt.hsos.reisetagebuch.Entitaet.Tag;
import projekt.hsos.reisetagebuch.Unterkunft.Unterkunft;

@Entity(tableName = "reise_table")
public class Reise {

    // Surogat
    @PrimaryKey(autoGenerate = true)
    private int reiseId;

    private ArrayList<Anreisemittel> anreisemittel;
    private ArrayList<Unterkunft> unterkuenfte;
    private ArrayList<Tag> tage;

    private int anzahlDerReisende, totalCosts, dauer, visaKosten;
    private double bewertung;
    private Datum anreiseDatum, abreiseDatum;
    // Thumbnail werden von SQL geladen
    Ort ort;


    public Reise() {
    }

    public void setReiseId(int reiseId) {
        this.reiseId = reiseId;
    }

    public final Reise AKTIVURLAUB = new Reise();
    public final Reise STRANDURLAUB = new Reise();
    public final Reise KULTURREISE = new Reise();
    public final Reise STADTREISE = new Reise();
    public final Reise WELLNESSREISE = new Reise();


    public int getReiseId() {
        return reiseId;
    }

    public ArrayList<Anreisemittel> getAnreisemittel() {
        return anreisemittel;
    }

    public ArrayList<Unterkunft> getUnterkuenfte() {
        return unterkuenfte;
    }

    public ArrayList<Tag> getTage() {
        return tage;
    }

    public int getAnzahlDerReisende() {
        return anzahlDerReisende;
    }

    public int getTotalCosts() {
        return totalCosts;
    }

    public int getDauer() {
        return dauer;
    }

    public int getVisaKosten() {
        return visaKosten;
    }

    public double getBewertung() {
        return bewertung;
    }

    public Datum getAnreiseDatum() {
        return anreiseDatum;
    }

    public Datum getAbreiseDatum() {
        return abreiseDatum;
    }

    public Ort getOrt() {
        return ort;
    }

    public Reise getAKTIVURLAUB() {
        return AKTIVURLAUB;
    }

    public Reise getSTRANDURLAUB() {
        return STRANDURLAUB;
    }

    public Reise getKULTURREISE() {
        return KULTURREISE;
    }

    public Reise getSTADTREISE() {
        return STADTREISE;
    }

    public Reise getWELLNESSREISE() {
        return WELLNESSREISE;
    }
}
