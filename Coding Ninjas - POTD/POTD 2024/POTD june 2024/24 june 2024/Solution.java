import java.util.* ;
import java.io.*; 
public class Solution
{
public static int maxSumRectangle(int[][] arr, int n, int m)
    {
        // Write your code here.
        int max=Integer.MIN_VALUE;

        int temp[] = new int[n];

        for(int i=0; i<m; i++){
            Arrays.fill(temp, 0);

            for(int j=i; j<m; j++){
                for(int k=0; k<n; k++){
                    temp[k]+=arr[k][j];
                }

                int currmax=kadne(temp);

                max=Math.max(currmax, max);
            }
        }
        return max;
    }

    public static int kadne(int arr[]){
        int max=arr[0];
        int currmax=arr[0];

        for(int i=1; i<arr.length; i++){
            currmax=Math.max(arr[i], currmax+arr[i]);

            max=Math.max(max, currmax);
        }

        return max;
    }
}
