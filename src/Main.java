import java.util.Iterator;
import java.util.TreeMap;

public class Main{

    public static void main(String[] args) {

        TreeMap<NrTelefoniczny, Wpis> treeMap = new TreeMap<>();

        NrTelefoniczny tel1 = new NrTelefoniczny(730262026, 48);
        NrTelefoniczny tel2 = new NrTelefoniczny(796012131, 48);
        NrTelefoniczny tel3 = new NrTelefoniczny(123456789, 68);
        NrTelefoniczny tel4 = new NrTelefoniczny(987654321, 45);

        Osoba osoba1 = new Osoba("Justyna", "Misior", "Wróbla 18a/2", tel1.getNrTelefonu());
        osoba1.opis();
        Osoba osoba2 = new Osoba("Mariusz", "Czajkowski", "Pięna 34/5/6", tel2.getNrTelefonu());
        osoba2.opis();
        Firma firma1 = new Firma("Gruby Benek", "Ulica 42", tel3.getNrTelefonu());
        firma1.opis();
        Firma firma2 = new Firma("PizzaPlace", "Aleja 26", tel4.getNrTelefonu());
        firma2.opis();

        treeMap.put(tel1, osoba1);
        treeMap.put(tel2, osoba2);
        treeMap.put(tel3, firma1);
        treeMap.put(tel4, firma2);

        for (Iterator i = treeMap.keySet().iterator(); i.hasNext();) {
            Object key = i.next();
            Wpis value = treeMap.get(key);
            System.out.println(key + ": ");
            value.opis();
        }
    }
}
