package projekt.hsos.reisetagebuch.Unterkunft;

public class Hotel extends Unterkunft {
    private int sterne;

    public Hotel(String name, int sterne){
        super(name);
        this.sterne = sterne;
    }

    public Hotel(){
        super();
    }

    public int getSterne() {
        return sterne;
    }

    public void setSterne(int sterne) {
        this.sterne = sterne;
    }
}
