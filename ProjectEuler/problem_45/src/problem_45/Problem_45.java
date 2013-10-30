/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package problem_45;

import java.util.Arrays;

/**
 *
 * @author michael
 */
public class Problem_45 
{

    static int max = 100000;
    static double[] array1 = new double[max];
    static double[] array2 = new double[max];
    
    public static void main(String[] args) 
    {   
        for (int i=0;i<max;i++)
        {
            triangle(i);
            pentagonal(i);
        }
        //System.out.println(Arrays.binarySearch(array1,40755 );
        //System.out.println(array1[285]);
        int p = 0, key=40755;
        p=Arrays.binarySearch(array2, key);
        System.out.println(p);
    }
    public static void triangle(double i)
    {
        array1[i] = i*(i+1)/2;
    }
    public static void pentagonal(double i)
    {
        array2[i] = i * (3 * i - 1) / 2;
    }
}
