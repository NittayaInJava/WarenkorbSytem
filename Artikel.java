
// Klasse für Artikel
 class Artikel{
     private String name;
     private double preis;
     private int anzahl;
     
     public Artikel(String name, double preis, int anzahl){
         this.name=name;
         this.preis=preis;
         this.anzahl=anzahl;
     }
     
     public String getName(){
         return name;
     }
     
     public double getPreis(){
         return preis;
     }
     
     public int getAnzahl(){
         return anzahl;
     }
     
     public double berechneGesamtpreis(){
         return preis*anzahl;
     }
     
     @Override
     public String toString(){
         return name + "- " + anzahl+" Stück - " + berechneGesamtpreis() + " EUR";
         
     }
       
    
 }