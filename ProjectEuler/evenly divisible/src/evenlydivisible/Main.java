/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package evenlydivisible;

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
        boolean tf=true;
        int i;
        for (i=1;tf;i++)
        {
            if (i%2==0)
                if(i%3==0)
                    if(i%4==0)
                        if(i%5==0)
                            if(i%6==0)
                                if(i%7==0)
                                    if(i%8==0)
                                        if(i%9==0)
                                            if(i%10==0)
                                                if(i%11==0)
                                                    if(i%12==0)
                                                        if(i%13==0)
                                                            if(i%14==0)
                                                                if(i%15==0)
                                                                    if(i%16==0)
                                                                        if(i%17==0)
                                                                            if(i%18==0)
                                                                                if(i%19==0)
                                                                                    if(i%20==0)
                                            {
                                                tf = false;
                                                break;
                                            }

        }
        System.out.println(i);
    }

}
