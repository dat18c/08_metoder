public class Firkant
{
   double a;
   double b;
   double areal;
   
   public void areal()
   {
      //areal = ab
      //double areal;
      areal = a * b;
      System.out.println(areal);
   }
   
   public void omkreds()
   {
      //omkreds = 2(a+b)
      System.out.println(2*(a+b));
   }

   public void udskriv()
   {
      areal();
      omkreds();
      System.out.println("Areal er stadig: " + areal);
   }
}