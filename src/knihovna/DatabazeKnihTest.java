/*
Autor:  Hynek Zemanec
xname:  zemh02
Dne:    27.3.2018
 */

package knihovna;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DatabazeKnihTest {

    Ctenar clen1 = new Ctenar("Lojza", "Farský", "Prčice 13, Kyrgistán");
    Ctenar clen2 = new Ctenar("Borat", "Sagdiev", "Kusek 1, Kazachstán");
    Ctenar clen3 = new Ctenar("Azamat", "Bagatov", "Astana 23, Kazachstán");

    Kniha kniha1 = new Kniha("Kazachstan, překrásná zem", 1,"Cestopisný román", 50, clen2);
    Kniha kniha2 = new Kniha("Líp jak v Kazachstánu", 2,"Cestopisnější román", 51);
    Kniha kniha3 = new Kniha("Jak uvádět pořady", 3, "Udělej si sám", 200, clen3);
    ArrayList<Kniha> db = new ArrayList<>();

    DatabazeKnih knihovna = new DatabazeKnih((ArrayList<Kniha>) db);

    ArrayList<Kniha> testovaciDb = new ArrayList<>();



    /***************************************************************************
     * Inicializace předcházející spuštění každého testu a připravující tzv.
     * přípravek (fixture), což je sada objektů, s nimiž budou testy pracovat.
     */
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void zadejKnihu() {

        assertTrue(knihovna.zadejKnihu(kniha1));
        assertTrue(knihovna.zadejKnihu(kniha2));

    }

    @Test
    public void vratKnihu() {

        knihovna.zadejKnihu(kniha2);
        knihovna.zadejKnihu(kniha3);

        assertNotNull(knihovna.vratKnihu(2));
        assertEquals(knihovna.vratKnihu(2), kniha2);
        assertNull(knihovna.vratKnihu(100));
    }

    @Test
    public void knihaJeVDatabazi() {

        knihovna.zadejKnihu(kniha2);
        knihovna.zadejKnihu(kniha1);

        assertTrue(knihovna.knihaJeVDatabazi(kniha1.getCisloKnihy()));
        assertTrue(knihovna.knihaJeVDatabazi(2));
        assertFalse(knihovna.knihaJeVDatabazi(10));
        assertTrue(knihovna.knihaJeVDatabazi(1));

    }

    @Test
    public void vratSeznamKnih()     {
        knihovna.zadejKnihu(kniha1);
        testovaciDb.add(kniha1);
        assertEquals(testovaciDb, knihovna.vratSeznamKnih());

        testovaciDb.add(kniha2);
        assertNotEquals(testovaciDb, knihovna.vratSeznamKnih());
        assertArrayEquals(new int[]{1,2,3},new int[]{1,2,3});
    }

    @Test
    public void testVratSeznamKnihNaPujceni() {
        knihovna.zadejKnihu(kniha1);
        knihovna.zadejKnihu(kniha2);
        assertNotNull(db);

    }
}