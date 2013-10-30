/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pathagoreantripples;

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
    int a=3,b=4,c=5;
    for (a=3;a<b;a++)
    {
        for (b=4;b<c;b++)
        {
            for (c=5;c<1000;c++)
            {
                if((a*a)+(b*b)==(c*c))
                {
                  //System.out.println("Pathagorean trippple exists at "+a+" "+b+" "+c);
                    if(a+b+c==1000)
                    {
                        System.out.println("Pathagorean trippple exists at "+a+" "+b+" "+c);
                        System.out.println("holy grail one line up!!!!!!!!!!!!!!!!!!!!");
                    }
                }
            }
        }
    }

  }

}
