package projekt.hsos.reisetagebuch.Entitaet;

public class Anreisemittel {
    private int kosten;
    String bezeichnung;

    public Anreisemittel(int kosten) {
        this.kosten = kosten;
    }
    public Anreisemittel(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Anreisemittel() {
    }

    public final Anreisemittel AUTO = new Anreisemittel();
    public final Anreisemittel ZUG = new Anreisemittel();
    public final Anreisemittel FLUGZEUG = new Anreisemittel();
    public final Anreisemittel BAHN = new Anreisemittel();

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public void setKosten() {
        this.kosten = kosten;
    }


}
