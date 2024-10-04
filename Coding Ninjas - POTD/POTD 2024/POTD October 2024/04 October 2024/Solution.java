import java.util.* ;
import java.io.*; 
public class Solution {

    public static int sumOfSmallestAndSecondSmallest(int n, int[] arr) {

        // Write your Code here
        int ans=Integer.MIN_VALUE;

        for(int i=0; i<n-1; i++){
            int sum=arr[i]+arr[i+1];
            ans=Math.max(ans, sum);
        }

        return ans;
    }
}