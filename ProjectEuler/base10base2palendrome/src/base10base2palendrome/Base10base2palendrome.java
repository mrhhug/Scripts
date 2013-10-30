/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package base10base2palendrome;

/**
 *
 * @author michael
 */
public class Base10base2palendrome {

    /**
     * @param args the command line arguments
     */
    static int j =0;
    public static void main(String[] args) 
    {
        for (int i=0;i<1000000;i++)
        {
            if(isPalindrome(Integer.toString(i)))
            {
                //System.out.println(i);
                Long base10 = Long.valueOf(i);
                if(isPalindrome(Long.toString(base10,2)))
                {
                    System.out.println("   "+Long.toString(base10,2));
                    j=i+j;
                }
            }
        }
        System.out.println(j);
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
