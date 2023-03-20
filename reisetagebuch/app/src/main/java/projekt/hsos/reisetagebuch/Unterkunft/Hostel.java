package projekt.hsos.reisetagebuch.Unterkunft;

public class Hostel extends Unterkunft {
    private int sterne;

    public Hostel(String name, int sterne) {
        super(name);
        this.sterne = sterne;
    }

    public Hostel(){
        super();
    }

    public void setSterne(int sterne) {
        this.sterne = sterne;
    }

    public int getSterne() {
        return sterne;
    }


}
