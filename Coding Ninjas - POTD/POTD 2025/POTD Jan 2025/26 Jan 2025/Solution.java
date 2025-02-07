import java.util.* ;
import java.io.*; 
public class Solution {

    public static long[] addFraction(int a, int b, int c, int d) {
        // Write your code here.
        long ans[] = new long[2];

        long num=(long)a*d+(long)c*b;
        long den=(long)b*d;

        long gcd=helper(den, num);

        ans[0]=num/gcd;
        ans[1]=den/gcd;

        return ans;
    }

    public static long helper(long a, long b){
        if(b==0){
            return a;
        }

        return helper(b, a%b);
    }

}