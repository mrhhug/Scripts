/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tripplewords;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;



public class Main {

    static int wordcount = 2947;
    static int bigwordcount = 8670074;
    static String md555 = "ec692f46ada9a97a21362540d69fd97e";

    public static void main(String[] args) throws IOException
    {
      String[] array;
      array = new String[wordcount];
      array=getarray();

      String[] bigarray;
      bigarray = new String[wordcount];
      bigarray=getbigarray();

      mate3(array,bigarray);
    }
    public static String[] getarray()
    {
        String[] array;
        array = new String[wordcount];
        int j=0;
        {
          try
          {
          // Open the file
          FileInputStream fstream = new FileInputStream("/home/michael/Scripts/md5sumcrack/src/md5sumcrack/commmmon.txt");
          // Get the object of DataInputStream
          DataInputStream in = new DataInputStream(fstream);
          BufferedReader br = new BufferedReader(new InputStreamReader(in));
           String strLine;
          //Read File Line By Line
          while ((strLine = br.readLine()) != null)
          {
            array[j]= strLine;
            j++;
            //System.out.println (array[j-1]);
          }
          //Close the input stream
          in.close();
          //System.out.println (array[j-1]);
          }catch (Exception e)
          {//Catch exception if any
          System.err.println("Error: " + e.getMessage());
          }
          return array;
       }
    }
    public static String[] getbigarray()
    {
        String[] array;
        array = new String[bigwordcount];
        int j=0;
        {
          try
          {
          // Open the file
          FileInputStream fstream = new FileInputStream("/home/michael/Scripts/matingwords/matedwords/2only.txt");
          // Get the object of DataInputStream
          DataInputStream in = new DataInputStream(fstream);
          BufferedReader br = new BufferedReader(new InputStreamReader(in));
           String strLine;
          //Read File Line By Line
          while ((strLine = br.readLine()) != null)
          {
            array[j]= strLine;
            j++;
            //System.out.println (array[j-1]);
          }
          //Close the input stream
          in.close();
          //System.out.println (array[j-1]);
          }catch (Exception e)
          {//Catch exception if any
          System.err.println("Error: " + e.getMessage());
          }
          return array;
       }
    }
    public static void mate3(String[] array,String[] bigarray) throws IOException
    {
        //home/michael/Scripts/matingwords
        String[] mates;
        mates = new String[bigwordcount];
        int a=0,b=0,j=0;
        for (a=0;a<wordcount;a++)
        {
            if(a!=0)
            {
                writearray(mates, Integer.toString(a));
            }
            j=0;
                for (b=0;b<bigwordcount;b++,j++)
                {
                    mates[j]=array[a]+bigarray[b];
                }
        }
    }
    public static void writearray(String[] array, String variable) throws IOException
    {
        File file = new File("/home/michael/Scripts/matingwords/matedwords/3/"+variable+".txt");
        PrintWriter out = new PrintWriter(new FileWriter(file));

        // Write each string in the array on a separate line
        for (String s : array)
        {
         out.println(s);
        }
        out.close();
    }

}
