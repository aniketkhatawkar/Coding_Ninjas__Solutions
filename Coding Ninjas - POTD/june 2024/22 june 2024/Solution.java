import java.util.* ;
import java.io.*; 
public class Solution
{
    public static int boringFactorials(int n, int p)
    {
        // Write your code here.
        int fac=1;

        // calculate fac after mod by p
        for(int i=1; i<=n; i++){
            fac=(fac*i)%p;
        }

        //return fac number
        return fac;
    }
}
