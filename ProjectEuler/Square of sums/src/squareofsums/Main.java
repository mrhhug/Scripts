/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package squareofsums;

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
    System.out.println(squaresums()-sumsquares());

    }

    private static int sumsquares() {
        int base;
        int sum=0;
        for (base=1;base<=100;base++)
        {
            sum = base*base+sum;
        }
        return sum;
    }

    private static int squaresums() {
        int base;
        int sum =0;
        for (base=1;base<=100;base++)
        {
            sum = base+sum;
        }
        sum = sum * sum;
        return sum;
    }

}
