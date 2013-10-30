/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package trianglenumbers;

/**
 *
 * @author mackel machel or Michael mrhhug@gmail.com
 */
public class Main
{

    
    public static void main(String[] args)
    {
         long count =0;
         long factor = 0;
         //Scanner myscan = new Scanner(System.in);
         //System.out.print("Please enter a number: ");
         //int number = myscan.nextInt();
         //6 mins to find 5984 ; 480
         long trianglenumber =76576500;
         long number = nextnum(trianglenumber);
         while(true)
         {
             for (long i = 1; i <= number; i++)
             {
                 if(number % i == 0)
                 {
                 factor = number / i;
                 //System.out.print(" " +factor);
                 count++;
                 }
             }

             //System.out.println(" ");
             System.out.println(trianglenumber);
             if (count>500)
             {
                 System.out.println(trianglenumber);
                 System.exit(0);
             }
             count =0;
             trianglenumber++;
             number = nextnum(trianglenumber);
            }
    }

    private static long nextnum(long num)
    {
     /*int temp;
     //System.out.print(trianglenumber);
     int i = trianglenumber;
     for (;i>1;i--)
     {
         temp=i;
     }
         //System.out.print(temp);
     return temp;*/
     long j = 1;
     for(long i = 1; i<= num; i++)
     {
         j = i * (i+1)/2;
         //System.out.print(j + " ");
     }
     return j;
    }
}
