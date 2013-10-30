/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amicablesums;

import java.util.Stack;

/**
 *
 * @author michael
 */
public class AmicableSums {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int h,k=0;
        for (int i =220;i<10000;i++)
        {
            h=getvalue(i);
            if (getvalue(h)==i)
            {
                if (h!=i)
                {
                    /*System.out.print(i);
                    System.out.print(" ");
                    System.out.println(h);*/
                    k =k+i;
                }
            }
            
        }
        System.out.println(k);
    }
    static int getvalue(int var)
    {
        Stack<Integer> stack = new Stack();
        for (int i =1;i<var;i++)
        {
            if(var % i==0)
            {
                stack.push(i);
            }   
        }
        return sumitup(stack);
    }
    static int sumitup(Stack<Integer> stack)
    {
        int j =0;
        while (!stack.empty())
        {
            j=j+stack.pop();
        }
        return j;
    }
}
