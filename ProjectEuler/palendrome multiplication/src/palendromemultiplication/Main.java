/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package palendromemultiplication;

import java.util.Arrays;

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
        int i,j;
        int array[];
        int arraycount=0;
        array = new int[10000];
        for (i=100;i<1000;i++)
        {
            for (j=100;j<1000;j++)
            {
                if (isPalindrome(Integer.toString(i*j)))
                {
                System.out.println(i*j);
                array[arraycount]=i*j;
                arraycount++;
                }
            }
        }
        Arrays.sort(array);
        System.out.println("the largest number is :"+array[(array.length)-1]);
    }
//========================================================= isPalindrome
//  This method returns 'true' if the parameter
//  is a palindrome, a word that is spelled the
//  same both forwards and backwards, eg, radar.

public static boolean isPalindrome(String word) {
    int left  = 0;                 // index of leftmost unchecked char
    int right = word.length() -1;  // index of the rightmost

    while (left < right) {         // continue until they reach center
        if (word.charAt(left) != word.charAt(right)) {
            return false;          // if chars are different, finished
        }
        left++;                    // move left index toward the center
        right--;                   // move right index toward the center
    }

    return true;                   // if finished, all chars were same
}
}
