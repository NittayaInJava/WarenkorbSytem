import java.util.ArrayList;
import java.util.List;

// Klasse für den Warenkorb
public class Warenkorb {
    private List<Artikel> artikelListe;

    public Warenkorb() {
        artikelListe = new ArrayList<>();
    }

    public void artikelHinzufuegen(Artikel artikel) {
        artikelListe.add(artikel);
        System.out.println("Artikel hinzugefügt: " + artikel.getName());
    }

    public void artikelEntfernen(String name) {
        boolean gefunden = false;
        for (Artikel artikel : artikelListe) {
            if (artikel.getName().equalsIgnoreCase(name)) {
                artikelListe.remove(artikel);
                System.out.println("Artikel entfernt: " + name);
                gefunden = true;
                break;
            }
        }
        if (!gefunden) {
            System.out.println("Artikel nicht gefunden: " + name);
        }
    }
    
    public void mengeAktualisieren(String name, int neueMenge){
        boolean gefunden=false;
        for(Artikel artikel:artikelListe){
            if(artikel.getName().equalsIgnoreCase(name)){
                if(neueMenge>0){
                    artikelListe.set(artikelListe.indexOf(artikel),
                    new Artikel(artikel.getName(), artikel.getPreis(), neueMenge));
                System.out.println("Menge von "+name + " aktualisiert auf" + neueMenge);
                
                }else {
                    System.out.println("Ungültige Menge. Sie muss größer als 0 sein.");
                }
                gefunden = true;
                break;
            }
        }
        if (!gefunden) {
            System.out.println("Artikel nicht gefunden: " + name);
            }
        }
    

    public void zeigeWarenkorb() {
        if (artikelListe.isEmpty()) {
            System.out.println("Der Warenkorb ist leer.");
        } else {
            System.out.println("Warenkorb:");
            for (Artikel artikel : artikelListe) {
                System.out.println(artikel);
            }
        }
    }

    public double berechneGesamtpreis() {
        double gesamtpreis = 0;
        for (Artikel artikel : artikelListe) {
            gesamtpreis += artikel.berechneGesamtpreis();
        }
        return gesamtpreis;
    }
}

