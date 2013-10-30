/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package factorialsum;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
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
        String output = new Scanner(new File("/home/michael/Scripts/factorial sum/usethisnum.txt")).useDelimiter("\\Z").next();
        //System.out.println("" + output);
        return output;
    }
    public static int chunk(String output)
    {
        int testing = 0;
        for ( int i=0; i<output.length(); i++)
        {
            char a = output.charAt(i);
            testing = Character.getNumericValue(a)+testing;
        }
        return testing;
    }

}
