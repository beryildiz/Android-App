package projekt.hsos.reisetagebuch.Entitaet;


import java.util.ArrayList;

import projekt.hsos.reisetagebuch.Reise.Reise;

public class User {

    // Standard User Attribute
    // https://docs.looker.com/admin-options/settings/user-attributes
    // Koennen gucken was wir rausschmeissen

    private ArrayList<Reise> reisen;

    private String benutzername, vorname, nachname, email;
    private int alter, level;

    public User() {
    }

    public User(String benutzername, String vorname, String nachname, String email, int alter) {
        this.benutzername = benutzername;
        this.vorname = vorname;
        this.nachname = nachname;
        this.email = email;
        this.alter = alter;
        this.level = 0;
    }

    /* Methoden Section */

    public void levelErhoehen() {
        this.level++;
    }

    @Override
    public String toString(){
        return "[ " + getBenutzername() +
                " " + getVorname() +
                " " + getNachname() +
                " " + getEmail() +
                " " + getAlter()
                + " ]";
    }

    /* Builder Section */

    public static class UserBuilder {
        private User user = new User();

        public UserBuilder(String benutzername, String vorname, String nachname) {
            user.benutzername = benutzername;
            user.vorname = vorname;
            user.nachname = nachname;
            user.level = 0;
        }

        public UserBuilder mitEmail(String email) {
            user.email = email;
            return this;
        }

        public UserBuilder mitAlter(int alter) {
            user.alter = alter;
            return this;
        }

        public User build() {
            return this.user;
        }

    }

    /* Getter Section */

    public String getBenutzername() {
        return benutzername;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getEmail() {
        return email;
    }

    public int getAlter() {
        return alter;
    }

    public int getLevel() {
        return level;
    }

    /* Setter Section */

    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}
