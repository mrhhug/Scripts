package problem_58;

public class Problem_58 
{
    static double primes = 0;
    static int totalcorners = 1; /// the program omits 1...
    static int i = 3; ///// start only odd > 2 here 
    //static double tempppp;
    static double quotient=1;
    
    public static void main(String[] args)
    {
        while (quotient > 0.10)
        {         
            if (miller_rabin_32(i*i-i+1)){primes++;}
            if (miller_rabin_32(i*i-2*i+2)){primes++;}
            if (miller_rabin_32(i*i-3*i+3)){primes++;}
            
            totalcorners += 4;
            i+=2;
            quotient = (primes / totalcorners);
        }
        System.out.println(i-2);//peal off the last iteration
    }
    public static boolean miller_rabin_32(int n) 
    {
         if (n <= 1) return false;
         else if (n == 2) return true;
         else if (miller_rabin_pass_32( 2, n) &&
             (n <= 7  || miller_rabin_pass_32( 7, n)) &&
             (n <= 61 || miller_rabin_pass_32(61, n)))
             return true;
         else
             return false;
     }
    private static boolean miller_rabin_pass_32(int a, int n) 
    {
        int d = n - 1;
 	int s = Integer.numberOfTrailingZeros(d);
 	d >>= s;
         int a_to_power = modular_exponent_32(a, d, n);
         if (a_to_power == 1) return true;
         for (int i = 0; i < s-1; i++) {
             if (a_to_power == n-1) return true;
             a_to_power = modular_exponent_32(a_to_power, 2, n);
         }
         if (a_to_power == n-1) return true;
         return false;
    }
    private static int modular_exponent_32(int base, int power, int modulus) 
    {
         long result = 1;
         for (int i = 31; i >= 0; i--) {
             result = (result*result) % modulus;
             if ((power & (1 << i)) != 0) {
                 result = (result*base) % modulus;
             }
         }
         return (int)result; // Will not truncate since modulus is an int
     }
}
