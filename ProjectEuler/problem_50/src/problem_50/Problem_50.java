/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package problem_50;

import java.math.BigInteger;
import java.util.Arrays;

/**
 *
 * @author michael
 */
public class Problem_50 {

    static long currentprime = 1;
    static int arraylength = 10;
    static int max = 99;
    static int arraylow = -1;
    static int arrayhigh = arraylength - 1;
    static int[] array = new int[arraylength];
    static int currentmax = 0;
    static int tempsum = 0;
    static int runningprime =1;

    public static void main(String[] args) 
    {
        for (int i = arraylow; i < max; i++) 
        {
            removefirst();
            fillarray();
            toobig();
            tempsum = sumthearray();
            if (isPrime(tempsum)) 
            {
                if (currentmax <= tempsum) 
                {
                    currentmax = tempsum;
                }
            }
            //System.out.println(i);
            System.out.println(Arrays.toString(array));
        }
        System.out.println(currentmax);
    }

    public static void toobig() 
    {
        if (sumthearray() > max) 
        {
            removelast();
            toobig();
        }
        if (!isPrime(sumthearray())) 
        {
            removelast();
        }
    }

    public static void removelast() 
    {
        arrayhigh--;
    }

    public static void removefirst() 
    {
        if (arraylow<arrayhigh)
        {
            arraylow++;
        }
    }

    public static void fillarray() 
    {
        currentprime = runningprime;
        runningprime++;
        for (int i = 0; i <= arraylength - 1; i++) {
            array[i] = 0;
        }
        for (int i = 0; i <= arraylength - 1; i++) {
            array[i] = (int) nextPrime(currentprime);
            currentprime = (int) nextPrime(currentprime);
        }
    }

    public static int sumthearray() 
    {
        int sum = 0;
        for (int i = arraylow; i < arrayhigh; i++) 
        {
            sum = sum + array[i];
        }
        
        if (sum == 53)
        {
            System.out.print(sum);
        }
        return sum;
    }

    public static long nextPrime(long previous) 
    {
        if (previous < 2L) {
            return 2L;
        }
        if (previous == 2L) {
            return 3L;
        }
        long next = 0L;
        int increment = 0;
        switch ((int) (previous % 6L)) {
            case 0:
                next = previous + 1L;
                increment = 4;
                break;
            case 1:
                next = previous + 4L;
                increment = 2;
                break;
            case 2:
                next = previous + 3L;
                increment = 2;
                break;
            case 3:
                next = previous + 2L;
                increment = 2;
                break;
            case 4:
                next = previous + 1L;
                increment = 2;
                break;
            case 5:
                next = previous + 2L;
                increment = 4;
                break;
        }
        while (!isPrime(next)) {
            next += increment;
            increment = 6 - increment;   // 2, 4 alternating
        }
        return next;
    }

    public static boolean isPrime(long n) 
    {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
