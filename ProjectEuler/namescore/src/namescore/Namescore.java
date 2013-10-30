/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package namescore;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author michael
 */
public class Namescore 
{

    /**
     * @param args the command line arguments
     */
    static String[] words = new String[5163];
    static int i =0;
    static int j =0;
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        gettext();
        java.util.Arrays.sort(words);
        //System.out.println(Arrays.toString(words));
        String temp;
        for (int rr=0;rr<5163;rr++)
        {
            words[rr]=getvalue(words[rr]);
        }
        System.out.println(Arrays.toString(words));
        System.out.println(words[937]);
        domath();
    }
    public static void domath()
    {
        int count=0;
        int insideloop;
        for (int i =0 ;i<5163;i++)
        {
            insideloop=0;
            insideloop=insideloop+Integer.parseInt(words[i]);
            count = count + (insideloop*(i+1));
        }
        System.out.println(count);
    }
    public static String getvalue(String str)
    {   
       int current =0;
       for (int qq=0;qq<str.length();qq++)
       {
           current = current +compare(str.charAt(qq));
       }
       return Integer.toString(current);
    }
    public static int compare(char c)
    {
        int j=0;
        switch (c) 
        {
            case 'A':  j = 1;
                     break;
            case 'B':  j = 2;
                     break;
            case 'C':  j = 3;
                     break;
            case 'D':  j = 4;
                     break;
            case 'E':  j = 5;
                     break;
            case 'F':  j = 6;
                     break;
            case 'G':  j = 7;
                     break;
            case 'H':  j = 8;
                     break;
            case 'I':  j = 9;
                     break;
            case 'J':  j = 10;
                     break;
            case 'K':  j = 11;
                     break;
            case 'L':  j = 12;
                     break;
            case 'M':  j = 13;
                     break;
            case 'N':  j = 14;
                     break;
            case 'O':  j = 15;
                     break;
            case 'P':  j = 16;
                     break;
            case 'Q':  j = 17;
                     break;
            case 'R':  j = 18;
                     break;
            case 'S':  j = 19;
                     break;
            case 'T':  j = 20;
                     break;
            case 'U':  j = 21;
                     break;
            case 'V':  j = 22;
                     break;
            case 'W':  j = 23;
                     break;
            case 'X':  j = 24;
                     break;
            case 'Y':  j = 25;
                     break;
            case 'Z':  j = 26;
                     break;
            //default: j = 0;
                    // break;
        }
        return j;
    }
    public static void gettext() throws FileNotFoundException, IOException
    {
        BufferedReader br = new BufferedReader(
        new InputStreamReader(new FileInputStream("/home/michael/configure/namescore/names.txt")));
        try 
        {
            String line;
            while ((line = br.readLine()) != null)
            {
                words[i]=line;
                i++;
            }
        }
        finally 
        {
            br.close();
        }
      }
}
