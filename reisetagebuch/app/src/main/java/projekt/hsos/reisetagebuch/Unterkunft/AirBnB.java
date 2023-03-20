package projekt.hsos.reisetagebuch.Unterkunft;

import projekt.hsos.reisetagebuch.Datum.Datum;
import projekt.hsos.reisetagebuch.Entitaet.Ort;

public class AirBnB extends Unterkunft {
    private double bewertung;

    public AirBnB(String name, double bewertung) {
        super(name);
        this.bewertung = bewertung;
    }

    public AirBnB(){
        super();
    }

    public double getBewertung() {
        return bewertung;
    }

    public void setBewertung(double bewertung) {
        this.bewertung = bewertung;
    }


    public String getName() {
        return super.getName();
    }




}
