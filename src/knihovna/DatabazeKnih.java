/*
Autor:  Hynek Zemanec
xname:  zemh02
Dne:    27.3.2018
 */

package knihovna;

import java.util.*;
import knihovna.*;

public class DatabazeKnih {

    private ArrayList<Kniha> db = new ArrayList<Kniha>();

    public DatabazeKnih(ArrayList<Kniha> db) {
        this.db = db;
    }

//    Kniha se přidá pouze pokud v databázi není kniha se stejným číslem, jako má zadávaná kniha.
// Vrací true, nebo false v závislosti na výsledku přidávání do seznamu (přidáno = true, nepřidáno = false)
//    prida knihu do DB

    public boolean zadejKnihu(Kniha kniha) {
        if (db.isEmpty()) {
            db.add(kniha);
            return true;
        } else {
            for (Kniha i : db) {
                if (i.getCisloKnihy() == kniha.getCisloKnihy()) {
                    return false;
                }
            }
            db.add(kniha);
            return true;
        }
    }

    // v databázi knih najde knihu s předaným číslem a vrátí odkaz na knihu.
// Pokud se kniha nenachází v databázi, metoda vrátí hodnotu null.

    public Kniha vratKnihu(int cisloKnihy) {
        if (db.isEmpty()) {
            return null;
        } else {
            for (Kniha i : db) {
                if (i.getCisloKnihy() == cisloKnihy) {
                    return i;
                }
            }
            return null;
        }
    }

    //v databázi knih najde knihu s předaným číslem. Pokud je kniha v databázi, vrátí hodnotu true. Pokud kniha v databázi není, vrátí false

    public boolean knihaJeVDatabazi(int cisloKnihy) {
        if (db.isEmpty()) {
            return false;
        } else {
            for (Kniha i : db) {
                if (i.getCisloKnihy() == cisloKnihy) {
                    return true;
                }
            }
            return false;
        }
    }

//vrátí seznam všech knih v databázi. Pokud nejsou evidovány žádné knihy, musí metoda vrátit prázdný seznam, ne null!

    public Collection<Kniha> vratSeznamKnih() {
        if (db.isEmpty()) {
            return db;
        } else {
            return db;
        }
    }

//        vrátí celý seznam knih, které jsou volné k půjčení (tedy němají přiřazeného čtenáře).
// Metoda vrací prázdný seznam, pokud žádné knihy k půjčení nejsou (všechny knihy mají přiřazeného čtenáře)

    public Collection<Kniha> vratSeznamKnihNaPujceni() {
        ArrayList<Kniha> volneKnihy = new ArrayList<>();
        if (db.isEmpty()){
            return db;
        } else {
            for (Kniha i : db) {
                if (i.getCtenar() == null) {
                    volneKnihy.add(i);
                }
            }   return volneKnihy;
        }
    }
}
