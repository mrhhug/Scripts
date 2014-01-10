/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package findprimes;

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
        int num;
        int i,c=1;
        boolean isprime = true;
        for (num=2;c<2000001;num++)
        {
            for (i=num-1;i>1;i--)
            {
                if(num%i==0) isprime=false;
            }
            if (isprime) 
            {
                System.out.println(num);
                c++;
            }
            isprime = true;
        }
    }

}
