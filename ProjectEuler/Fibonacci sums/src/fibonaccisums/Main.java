/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonaccisums;

/**
 *
 * @author mackel machel or Michael mrhhug@gmail.com
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       long max = 4000000;
       long num1=1;
       long num2=2;
       long sum=0;
       long swap;
       while(num2<max)
       {
           if (num2%2==0)
           {
               sum = sum + num2;
           }
           swap = num2;
           num2= num1+num2;
           num1 = swap;
       }
       System.out.println(sum);
    }

}
