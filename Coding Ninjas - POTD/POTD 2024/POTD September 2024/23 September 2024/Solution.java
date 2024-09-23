import java.util.* ;
import java.io.*; 
public class Solution
{
    public static int boringFactorials(int n, int p)
    {
        // Write your code here.
        if(n>=p){
            return 0;
        }

        long fac=1;

        for(int i=2; i<=n; i++){
            fac=(fac*i)%p;
        }

        return (int)fac;
    }
}
