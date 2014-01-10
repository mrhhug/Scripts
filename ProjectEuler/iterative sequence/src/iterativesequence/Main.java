/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package iterativesequence;

/**
 *
 * @author mackel machel or Michael mrhhug@gmail.com
 */
public class Main
{



    public static void main(String[] args) 
    {
       long lengthcount;
       long highest=0;
       long number;

       for (number = 13;number<1000001;number++)
       {
           long tempnumber = number;
           lengthcount=0;
           while(tempnumber!=1)
           {
               if(tempnumber%2==0)
               {
                   tempnumber = tempnumber/2;
               }
               else
               {
                   tempnumber = tempnumber*3+1;
               }
               lengthcount++;
           }
           if(lengthcount>highest)
           {
               highest = lengthcount;
               System.out.println(number);
           }
       }
       //System.out.println(highest);
    }

}
