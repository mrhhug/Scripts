/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package combinatorics;

import java.math.BigInteger;

/**
 *
 * @author michael
 */
public class Combinatorics 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println(fact(13));

    }
    public static BigInteger fact(int i)
    {
        BigInteger n = BigInteger.ONE;
        n = n.multiply(BigInteger.valueOf(i));
        //System.out.println(i + "! = " + n);
        return n;
    }
    
}
