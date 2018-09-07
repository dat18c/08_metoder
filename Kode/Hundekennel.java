public class Hundekennel
{
   
   public static void main(String[] args){
      //lav et par hunde
      //brug konstruktør
      Hund hund1 = new Hund();
      Hund hund2 = new Hund(); 
   
      //sæt attributer for hunde
      //udskift med kald af set metode
      hund1.navn = "Pluto";
      hund1.alder = 10;
      hund1.vaegt = 25;
      hund1.farve = "Orange";
      
      hund2.navn = "Fido";
      hund2.alder = 2;
      hund2.vaegt = 2.5;
      hund2.farve = "grå";
      
      //udskriv hunde
      //udskift med kald af udskriv metode
      System.out.println("Navn:\t\t" + hund1.navn);
      System.out.println("Alder:\t" + hund1.alder + " mdr");
      System.out.println("Vægt:\t\t" + hund1.vaegt + " kg");
      System.out.println("Farve:\t" + hund1.farve + "\n");
      
      System.out.println("Navn:\t\t" + hund2.navn);
      System.out.println("Alder:\t" + hund2.alder + " mdr");
      System.out.println("Vægt:\t\t" + hund2.vaegt + " kg");
      System.out.println("Farve:\t" + hund2.farve + "\n");
      
   }
   
}