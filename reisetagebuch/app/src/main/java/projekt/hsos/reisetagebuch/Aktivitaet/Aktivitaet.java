package projekt.hsos.reisetagebuch.Aktivitaet;

public class Aktivitaet {
    private int kosten;
    private String beschreibung;
    // Bilder werden in der Datenbank geladen

    public Aktivitaet(){}


    public int getKosten() {
        return kosten;
    }

    public void setKosten(int kosten) {
        this.kosten = kosten;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }


}
