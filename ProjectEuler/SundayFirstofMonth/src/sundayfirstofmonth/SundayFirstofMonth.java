/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sundayfirstofmonth;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author michael
 */
public class SundayFirstofMonth 
{
static Queue<Character> queueDay=new LinkedList<Character>();
static Queue<String> queueDayandNum=new LinkedList<String>();

    public static void main(String[] args) 
    {
        DateDifference difference = new DateDifference();
        int j = difference.mainly();
        System.out.println(j);
        fillqueue(j);
        dowork();
        System.out.println(mathcpattern());

    }
    public static int mathcpattern()
    {
        int i =0;
        while (queueDayandNum.peek()!=null)
        {
            System.out.println(queueDayandNum.remove());
            /*if (queueDayandNum.remove()=="t1")
            {
                i++;
                System.out.println("sadfasdfASDFASFASFEWS");
            }*/
        }
        return i;
    }
    public static void dowork()
    {
        for (int i =1901;i<2001;i++)
        {
            if(i%4==0)leapyear(); else regularyear();
        }
    }
    public static void regularyear()
    {
        thirtyOneday();
        twentyeightday();
        thirtyOneday();
        thirtyday();
        thirtyOneday();
        thirtyday();
        thirtyOneday();
        thirtyOneday();
        thirtyday();
        thirtyOneday();
        thirtyday();
        thirtyOneday(); 
    }
    public static void leapyear()
    {
        thirtyOneday();
        twentynineday();
        thirtyOneday();
        thirtyday();
        thirtyOneday();
        thirtyday();
        thirtyOneday();
        thirtyOneday();
        thirtyday();
        thirtyOneday();
        thirtyday();
        thirtyOneday(); 
    }
    public static void thirtyday()
    {
        for (int i= 1;i<31;i++)
        {
            queueDayandNum.add(queueDay.poll()+Integer.toString(i));
        }
    }
    public static void thirtyOneday()
    {
        for (int i= 1;i<32;i++)
        {
            queueDayandNum.add(queueDay.poll()+Integer.toString(i));
        }
    }
    public static void twentyeightday()
    {
        for (int i= 1;i<29;i++)
        {
            queueDayandNum.add(queueDay.poll()+Integer.toString(i));
        }
    }
    public static void twentynineday()
    {
        for (int i= 1;i<30;i++)
        {
            queueDayandNum.add(queueDay.poll()+Integer.toString(i));
        }
    }
    static void fillqueue(int j)
    {
        while (j>0)
        {
            queueDay.add('t'); //the first day was a tuesday in 1 Jan 1901
            queueDay.add('w');
            queueDay.add('h');
            queueDay.add('f');
            queueDay.add('a');
            queueDay.add('S');
            queueDay.add('M');
            j=j-7;
        }
    }
}
