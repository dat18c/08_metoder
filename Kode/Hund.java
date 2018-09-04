public class Hund
{
   
   //private felter
   String navn = "";
   String farve = "";
   int alder = 0;
   double vaegt = 10.0;
   
   //konstruktør
   
   
   //metode til udskrift af hunde
   public void hundeInfo(){
      System.out.println("Navn:\t\t" + navn);
      System.out.println("Farve:\t" + farve);
      System.out.println("Alder:\t" + alder + " år");
      System.out.println("Vaegt:\t" + vaegt + " kg\n");
   }
   
}