/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package consecutiveproducts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author mackel machel or Michael mrhhug@gmail.com
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        String output = getstring();
        System.out.println(chunk(output));
    }
    public static String getstring() throws FileNotFoundException
    {
   //Z means: "The end of the input but for the final terminator, if any"
        String output = new Scanner(new File("/home/michael/Scripts/consecutive products/usethisnum.txt")).useDelimiter("\\Z").next();
        //System.out.println("" + output);
        return output;
    }
    public static int chunk(String output)
    {
        int highest = 0;
        for ( int i=0; i<output.length()-4; i++)
        {
            char a = output.charAt(i);
            char b = output.charAt(i+1);
            char c = output.charAt(i+2);
            char d = output.charAt(i+3);
            char e = output.charAt(i+4);
            int testing = Character.getNumericValue(a)*Character.getNumericValue(b)*Character.getNumericValue(c)*Character.getNumericValue(d)*Character.getNumericValue(e);
            if (testing>highest)highest = testing;
        }
        return highest;
    }

}
