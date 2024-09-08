import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static int missingNumber(int[] arr, int n) 
    {
        // Write your code here
        int d=(arr[n-1]-arr[0])/n;

        for(int i=0; i<n-1; i++){
            if(arr[i+1]-arr[i]!=d){
                return arr[i]+d;
            }
        }
        return 0;
    }
}

