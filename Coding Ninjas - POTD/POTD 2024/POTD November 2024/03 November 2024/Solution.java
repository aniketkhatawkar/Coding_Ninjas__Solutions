import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static int missingNumber(int[] arr, int n) 
    {
        // Write your code here
        int d=(arr[n-1]-arr[0])/n;

        int left=0, right=n-1;

        while(left<right){
            int mid=left+(right-left)/2;
            int exmid=arr[0]+mid*d;

            if(arr[mid]!=exmid){
                right=mid;
            }
            else {
                left=mid+1;
            }
        }

        return arr[0]+left*d;
    }
}

