/*
Autor:  Hynek Zemanec
xname:  zemh02
Dne:    16.3.2018
 */

package knihovna;
import knihovna.Kniha;
import knihovna.Ctenar;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Ctenar clen1 = new Ctenar("Lojza", "Farský", "Prčice 13, Kyrgistán");
        Ctenar clen2 = new Ctenar("Borat", "Sagdiev", "Kusek 1, Kazachstán");
        Ctenar clen3 = new Ctenar("Azamat", "Bagatov", "Astana 23, Kazachstán");

        Kniha kniha1 = new Kniha("Kazachstan, překrásná zem", 1,"Cestopisný román", 50, clen2);
        Kniha kniha2 = new Kniha("Líp jak v Kazachstánu", 2,"Cestopisnější román", 51);
        Kniha kniha3 = new Kniha("Jak uvádět pořady", 3, "Udělej si sám", 200, clen3);

        System.out.println(kniha1.toString());
        System.out.println(kniha2.toString());
        System.out.println(kniha3.toString());
        System.out.println(clen2.toString());
    }
}
