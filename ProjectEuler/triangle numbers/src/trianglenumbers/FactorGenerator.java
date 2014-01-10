/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package trianglenumbers;

public class FactorGenerator
{

   private int number;
   private int i;
   int count=0;


   public FactorGenerator(int numberToFactor)
   {
      number = numberToFactor;

   }

   public int nextFactor()
   {
         while(number % i == 0)
         {
            System.out.print((Math.round(i)) + " ");
            //iterator();
            number =((number / i));
            return i;
         }

         return i;
   }

   public boolean hasMoreFactors()
   {
      for ( i = 2; i <= number; i++)
      {
         nextFactor();
      }
      return false;

   }
   public void iterator()
   {
       count++;
       System.out.println(count);
       if(count==501)
       {
       System.out.println("got it");
       System.exit(0);
       }
   }
}