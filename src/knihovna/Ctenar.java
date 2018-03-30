/*
Autor:  Hynek Zemanec
xname:  zemh02
Dne:    16.3.2018
 */

package knihovna;

public class Ctenar {

    private String jmeno;
    private String prijmeni;
    private String bydliste;

    public Ctenar(String jmeno, String prijmeni, String bydliste) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.bydliste = bydliste;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public String getBydliste() {
        return bydliste;
    }

    public void setBydliste(String bydliste) {
        this.bydliste = bydliste;
    }

    @Override
    public String toString() {
        return jmeno + " " + prijmeni;
    }
}
