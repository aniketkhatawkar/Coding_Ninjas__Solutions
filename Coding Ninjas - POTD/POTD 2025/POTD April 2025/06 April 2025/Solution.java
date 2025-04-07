import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findKthFromRight(int n, int m, int k) {
        // Write your code here.
        long mul=(long)Math.pow(n,m);

        String str=String.valueOf(mul);
        int len=str.length();

        return Integer.parseInt(str.charAt(len-k)+"");
    }
}