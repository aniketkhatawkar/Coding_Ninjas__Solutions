import java.util.* ;
import java.io.*; 
public class Solution
{
public static int maxSumRectangle(int[][] arr, int n, int m)
    {
        // Write your code here.
        int ans=Integer.MIN_VALUE;

        for(int left=0; left<m; left++){
            int temp[] = new int[n];

            for(int rigth=left; rigth<m; rigth++){
                for(int i=0; i<n; i++){
                    temp[i]+=arr[i][rigth];
                }

                int curr=helper(temp);
                ans=Math.max(ans, curr);
            }
        }

        return ans;
    }

    public static int helper(int arr[]){
        int a=arr[0];
        int b=arr[0];

        for(int i=1; i<arr.length; i++){
            b=Math.max(b+arr[i], arr[i]);
            a=Math.max(a, b);
        }

        return a;
    }
}
