/*
Autor:  Hynek Zemanec
xname:  zemh02
Dne:    16.3.2018
 */
package knihovna;

import knihovna.Ctenar;

import java.util.Objects;

public class Kniha {

    private String jmeno;
    private int cisloKnihy;
    private String zanr;
    private int pocetStran;
    private Ctenar ctenar;

    public Kniha(String jmeno, int cisloKnihy, String zanr, int pocetStran) {
        this.jmeno = jmeno;
        this.cisloKnihy = cisloKnihy;
        this.zanr = zanr;
        this.pocetStran = pocetStran;
    }

    public Kniha(String jmeno, int cisloKnihy, String zanr, int pocetStran, Ctenar ctenar) {
        this.jmeno = jmeno;
        this.cisloKnihy = cisloKnihy;
        this.zanr = zanr;
        this.pocetStran = pocetStran;
        this.ctenar = ctenar;
    }


    public String getJmeno() {
        return jmeno;
    }

    public int getCisloKnihy() {
        return cisloKnihy;
    }

    public String getZanr() {
        return zanr;
    }

    public int getPocetStran() {
        return pocetStran;
    }

    public void setCtenar(Ctenar ctenar) {
        this.ctenar = ctenar;
    }

    public Ctenar getCtenar() {
        return ctenar;
    }

    @Override
    public String toString() {
        if (ctenar != null) {
            return "Knihu " + jmeno + " (žánr " + zanr + ") s číslem " + cisloKnihy + " má vypůjčenou " + ctenar.toString()
                    + " bydlištem " + ctenar.getBydliste();
        }
        return "Knihu " + jmeno + " (žánr " + zanr + ") s číslem " + cisloKnihy + " nemá vypůjčenou nikdo.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kniha kniha = (Kniha) o;
        return cisloKnihy == kniha.cisloKnihy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(jmeno, cisloKnihy, zanr, pocetStran, ctenar);
    }
}
