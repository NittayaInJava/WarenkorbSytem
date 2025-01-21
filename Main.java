// Hauptklasse zum Testen
public class Main {
    public static void main(String[] args) {
        Warenkorb warenkorb = new Warenkorb();

        // Artikel hinzufügen
        Artikel artikel1 = new Artikel("Apfel", 0.5, 10);
        Artikel artikel2 = new Artikel("Brot", 2.0, 2);
        Artikel artikel3 = new Artikel("Milch", 1.5, 1);

        warenkorb.artikelHinzufuegen(artikel1);
        warenkorb.artikelHinzufuegen(artikel2);
        warenkorb.artikelHinzufuegen(artikel3);

        // Warenkorb anzeigen
        warenkorb.zeigeWarenkorb();

        // Menge aktualisieren
        warenkorb.mengeAktualisieren("Apfel", 20);

        // Warenkorb erneut anzeigen
        warenkorb.zeigeWarenkorb();

        // Gesamtpreis berechnen
        System.out.println("Gesamtpreis: " + warenkorb.berechneGesamtpreis() + " EUR");
    }
}
