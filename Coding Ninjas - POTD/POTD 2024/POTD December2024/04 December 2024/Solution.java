import java.util.* ;
import java.io.*; 
public class Solution {
    public static String maximumDifference(int n, int[] arr) {
        // Write your code here.
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            maxi=Math.max(maxi, arr[i]);
            mini=Math.min(mini, arr[i]);
        }

        return Math.abs(maxi-mini)%2==0 ?"EVEN" : "ODD";
    }
}