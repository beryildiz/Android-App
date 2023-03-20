package projekt.hsos.reisetagebuch.Entitaet;

public class Ort {

    private String landname;
    private String stadt;
    private String provinz;

    public Ort(String landname, String stadt) {
        this.landname = landname;
        this.stadt = stadt;
    }

    public Ort(){}


    public String getLandname() {
        return landname;
    }

    public void setLandname(String landname) {
        this.landname = landname;
    }

    public String getStadt() {
        return stadt;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public String getProvinz() {
        return provinz;
    }

    public void setProvinz(String provinz) {
        this.provinz = provinz;
    }
}
