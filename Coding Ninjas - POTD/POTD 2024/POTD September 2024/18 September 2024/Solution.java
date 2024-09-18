import java.util.* ;
import java.io.*; 
public class Solution {
    public static int optimalStrategyOfGame(int[] coins, int n) {
        // Write your code here. 
        int dp[][] = new int[n][n];

        for(int gap=0; gap<n; gap++){
            for(int i=0,j=gap; j<n; i++, j++){
                int a=(i+2<=j) ? dp[i+2][j] : 0;
                int b=(i+1<=j-1) ? dp[i+1][j-1] : 0;
                int c=(i<=j-2) ? dp[i][j-2] : 0;

                dp[i][j]=Math.max(coins[i]+Math.min(a,b), coins[j]+Math.min(b, c));
            }
        } 

        return dp[0][n-1];  
    }
}
