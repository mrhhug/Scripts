/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sumoffiftydigetnumbers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mackel machel or Michael mrhhug@gmail.com
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
          String numberstring = getstring();
          double[] dubarray= new double[100];
          dubarray = parse(numberstring);
          domath(dubarray);
    }
    public static String getstring() throws FileNotFoundException
    {
     //Z means: "The end of the input but for the final terminator, if any"
     String output = new Scanner(new File("/home/michael/Scripts/sum of fiftydiget numbers/usethisnum.txt")).useDelimiter("\\Z").next();
    //System.out.println("" + output);
    return output;
    }

    public static double[] parse(String numberstring)
    {
        String temp = "";
        int arraycount=0;
        double[] dubarray= new double[100];
        for ( int i=1; i<5001; i++)
        {
            temp += numberstring.charAt(i-1);
            if (i%50==0 && i!=0)
            {
                dubarray[arraycount]=Double.parseDouble(temp);
                temp = "";
                arraycount++;
            }
        }
        //System.out.println(Arrays.toString(dubarray));
        return dubarray;
    }
    private static void domath(double[] dubarray)
    {
        double temp =0;
        for(int i=0;i<100;i++)
        {
            System.out.println(dubarray[i]);
            temp = dubarray[i]+temp;
        }
        System.out.print(temp);
    }

}
