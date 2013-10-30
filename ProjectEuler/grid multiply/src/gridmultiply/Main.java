/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gridmultiply;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author mackel machel or Michael mrhhug@gmail.com
 */
public class Main {


    public static void main(String[] args) throws FileNotFoundException
    {

     String numberinline = getstring();

     int a2[][]=stringtoarray(numberinline);
     displayarray(a2);
     int potential = leftright(a2);
     System.out.println(potential);
     int potential2 = topbottom(a2);
     System.out.println(potential2);
     int potential3 = diagleft(a2);
     System.out.println(potential3);
     int potential4 = diagright(a2);
     System.out.println(potential4);
    }


    public static String getstring() throws FileNotFoundException
    {
   //Z means: "The end of the input but for the final terminator, if any"
        String output = new Scanner(new File("/home/michael/Scripts/grid multiply/grid.txt")).useDelimiter("\\Z").next();
        //System.out.println("" + output);

        //numberinline=numberinline.replace("\n", "");
        output=output.replaceAll("\\s","");
        return output;
    }
    private static int[][] stringtoarray(String numberinline)
    {
     int[][] a2 = new int[20][20];
     int count =0;
     for(int j =0;j<20;j++)
     {
         for (int i =0;i<20;i++)
         {
             char c = numberinline.charAt(count);
             char d = numberinline.charAt(count+1);
             String temp = Character.toString(c)+Character.toString(d);
             a2[j][i]=Integer.parseInt(temp);
             count =count+2;
         }
     }
     return a2;
    }
    private static void displayarray(int[][] a2)
    {
     //... Print array in rectangular form
        for (int i =0; i < 20; i++)
     {
        for (int j = 0; j < 20; j++)
        {
            System.out.print(" " + a2[i][j]);
        }
        System.out.println("");
     }
    }
    @SuppressWarnings("empty-statement")
    private static int topbottom(int[][] a2)
    {
     int highest =0;
     int temp=0;
     for(int j =0;j<20;j++)
     {
         for (int i=0;i<20;i++)
         {
            try
            {
                int a =a2[i][j];
                int b=a2[i+1][j];
                int c =a2[i+2][j];
                int d =a2[i+3][j];
                temp = a*b*c*d;
            }
            catch(java.lang.ArrayIndexOutOfBoundsException ue){;}
            if (temp>highest) highest = temp;

         }
     }
     return highest;
    }
    @SuppressWarnings("empty-statement")
    private static int leftright(int[][] a2)
    {
     int highest =0;
     int temp=0;
     for(int j =0;j<20;j++)
     {
         for (int i =0;i<20;i++)
         {
            try{temp = a2[i][j]*a2[i][j+1]*a2[i][j+2]*a2[i][j+3];}
            catch(java.lang.ArrayIndexOutOfBoundsException ue){;}
            if (temp>highest) highest = temp;

         }
     }
     return highest;
    }
    @SuppressWarnings("empty-statement")
    private static int diagleft(int[][] a2)
    {
     int highest =0;
     int temp=0;
     for(int j =0;j<20;j++)
     {
         for (int i =0;i<20;i++)
         {
            try{temp = a2[i][j]*a2[i+1][j+1]*a2[i+2][j+2]*a2[i+3][j+3];}
            catch(java.lang.ArrayIndexOutOfBoundsException ue){;}
            if (temp>highest) highest = temp;

         }
     }
     return highest;
    }
    @SuppressWarnings("empty-statement")
    private static int diagright(int[][] a2)
    {
     int highest =0;
     int temp=0;
     for(int j =0;j<20;j++)
     {
         for (int i =0;i<20;i++)
         {
            try{temp = a2[i][j+3]*a2[i+1][j+2]*a2[i+2][j+1]*a2[i+3][j];}
            catch(java.lang.ArrayIndexOutOfBoundsException ue){;}
            if (temp>highest) highest = temp;

         }
     }
     return highest;
    }
}