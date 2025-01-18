import java.util.* ;
import java.io.*; 
public class Solution {

    public static int maximumPoints(int n, int[][] grid)
    {
       // Write your code here.
       int ans=0;

       for(int i=0; i<n; i++){
           for(int j=0; j<n; j++){
               if(i==j || j+i==n-1){
                   ans+=grid[i][j];
               }
           }
       }

       return ans;
    }
}