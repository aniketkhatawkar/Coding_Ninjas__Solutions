import java.util.* ;
import java.io.*; 
public class Solution
{
public static int minSubarraySum(ArrayList<Integer> arr, int n, int k)
    {
        // Write your code here.
        int sum=0;

        for(int i=0; i<k; i++){
            sum+=arr.get(i);
        }

        int minsum=sum;

        for(int i=k; i<n; i++){
            sum+=arr.get(i)-arr.get(i-k);
            minsum=Math.min(sum, minsum);
        }

        return minsum;
    }
}
