/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package natuarlnumbersdivisibleby3or5;

/**
 *
 * @author mackel machel or Michael mrhhug@gmail.com
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int sum =0;
      int i;
      for (i=0;i<1000;i++)
        {
          if (i%3==0 || i%5==0)
              sum=sum+i;
        }
      System.out.println(sum);
      }
    }
