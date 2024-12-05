import java.util.* ;
import java.io.*; 
public class Solution {

    public static long[] addFraction(int a, int b, int c, int d) {
        // Write your code here.
        long n=(long)a*d+(long)b*c;
        long dm=(long)b*d;

        long ans=gcd(n, dm);
        n/=ans;
        dm/=ans;

        return new long[]{n,dm};
    }

    public static long gcd(long n, long dm){
        while(dm!=0){
            long temp=dm;
            dm=n%dm;
            n=temp;
        }

        return n;
    }

}