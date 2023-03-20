package projekt.hsos.reisetagebuch.Datum;

public class Datum {
    private int tag, monat, jahr;

    public Datum(int tag, int monat, int jahr){
        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;
    }

    public Datum(){}

    public int getMonat() {
        return monat;
    }

    public void setMonat(int monat) {
        this.monat = monat;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }
}
