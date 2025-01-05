import java.util.* ;
import java.io.*; 


public class Solution {

    static int minDiff(int n, int[] arr) {
        // Write your code here.

        Arrays.sort(arr);

        int mini=Integer.MAX_VALUE;

        for(int i=0; i<n-1; i++){
            mini=Math.min(mini, Math.abs(arr[i]-arr[i+1]));
        }

        return mini;

    }
}