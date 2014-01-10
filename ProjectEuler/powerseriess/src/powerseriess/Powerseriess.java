/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package powerseriess;

import java.math.BigInteger;

/**
 *
 * @author michael
 */
public class Powerseriess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        BigInteger bi1 = BigInteger.valueOf(0);
        BigInteger bi2 = BigInteger.valueOf(1);
        for (int i = 1;i<1001;i++)
        {
            bi2=BigInteger.valueOf(i);
            for(int j = i;j>1;j--)
            { 
                bi2=bi2.multiply(BigInteger.valueOf(i));
                //System.out.println(bi2+" @@@@@@@@@   ");
            }
           System.out.println(i+"   bi2   "+bi2);
            //System.out.println("       ");
           bi1=bi1.add(bi2);
        }
        System.out.println(bi1);
    }
}
