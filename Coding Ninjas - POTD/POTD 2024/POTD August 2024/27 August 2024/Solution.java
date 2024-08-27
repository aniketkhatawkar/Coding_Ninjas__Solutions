import java.util.* ;
import java.io.*; 
public class Solution
{
public static int maxSumRectangle(int[][] arr, int n, int m)
    {
        // Write your code here.
        int maxsum=Integer.MIN_VALUE;

        for(int left=0; left<m; left++){
            int[] temp=new int [n];

            for(int right=left; right<m; right++){

                for(int i=0; i<n; i++){
                    temp[i]+=arr[i][right];
                }

                int currmaxsum=helper(temp);

                maxsum=Math.max(maxsum, currmaxsum);
            }
        }
        return maxsum;
    }

    private static int helper(int [] arr){
        int maxsum=arr[0];
        int currsum=arr[0];

        for(int i=1; i<arr.length; i++){
            currsum=Math.max(arr[i], currsum+arr[i]);
            maxsum=Math.max(maxsum, currsum);
        }

        return maxsum;
    }
}
