/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package primefactor;

/**
 *
 * @author mackel machel or Michael mrhhug@gmail.com
 */
public class Main {

public static boolean isPrime(long n)
{
    boolean prime = true;
    for (long i = 3; i <= Math.sqrt(n); i += 2)
    if (n % i == 0)
    {
        prime = false;
        break;
    }
    if (( n%2 !=0 && prime && n > 2) || n == 2)
    {
        return true;
    }
    else
    {
        return false;
    }
}
    public static void main(String[] args)
    {
        long n;
        long sum =0;
        for (n=0;n<2000001;n++)
        {
            if (isPrime(n))
            {
                //System.out.println(n);
                sum = sum + n;
            }
        }
        System.out.println(sum);
    }

}
