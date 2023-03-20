package projekt.hsos.reisetagebuch.Aktivitaet;

public class Restaurant extends Aktivitaet{
    private String kueche;

    Restaurant(String kueche){
        super();
        this.kueche = kueche;
    }

    public String getKueche() {
        return kueche;
    }

    public void setKueche(String kueche) {
        this.kueche = kueche;
    }
}
