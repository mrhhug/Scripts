/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package problem_56;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Stack;

/**
 *
 * @author michael
 */
public class Problem_56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double winner =0;
        double dd ;//= Math.pow(100,100);
        BigInteger zz;
        for (int i =0;i<100;i++)
        {
            for (int k=0;k<100;k++)
            {
                zz=pow(BigInteger.valueOf(i),BigInteger.valueOf(k));
                double ddd = sums(zz.toString());
                if(ddd>=winner)winner = ddd;
                //System.out.println(" "+i+" "+k+" "+formatDouble(ddd));
            }
        }
        //System.out.println(sums(formatDouble(dd)));
        System.out.println(formatDouble(winner));
        //BigInteger zz = BigInteger.valueOf(99);
        //BigInteger zzz = BigInteger.valueOf(95);
        //System.out.println(pow(zz,zzz));
    }
    public static BigInteger pow(BigInteger x, BigInteger y) 
    {  
        if (y.compareTo(BigInteger.ZERO) < 0)  
        throw new IllegalArgumentException();  
        BigInteger z = x; // z will successively become x^2, x^4, x^8, x^16, x^32...  
        BigInteger result = BigInteger.ONE;  
        byte[] bytes = y.toByteArray();  
        for (int i = bytes.length - 1; i >= 0; i--) 
        {  
            byte bits = bytes[i];  
            for (int j = 0; j < 8; j++) 
            {  
                if ((bits & 1) != 0)  
                result = result.multiply(z);  
                // short cut out if there are no more bits to handle:  
                if ((bits >>= 1) == 0 && i == 0)  
                return result;  
                z = z.multiply(z);  
            }  
        }  
        return result;  
    }  
    public static double sums(String dd)
     {
         //Stack<Integer> stack = null;
         Stack <Integer>stack = new Stack();
         double total=0;
         for(int i=dd.length()-1;i>=0;i--)
         {
             stack.push(Integer.parseInt(Character.toString(dd.charAt(i))));
             //System.out.println(dd.length());
             //System.out.print(Character.toString(dd.charAt(i)));
         }
         //System.out.println(stack);
         while (!stack.empty())
         {
            total = total+stack.pop();
         }
         return total;
     }
     public static String formatDouble(double myDouble)
     {
         NumberFormat numberFormatter = new DecimalFormat("#");
         String result = numberFormatter.format(myDouble);
         return result;
     }
     
}
