import java.util.* ;
import java.io.*; 
public class Solution {
    public static int optimalStrategyOfGame(int[] coins, int n) {
        // Write your code here.    
        int arr[][] = new int[n][n];

        for(int i=0; i<n; i++){
            for(int a=0, b=i; b<n; a++, b++){
                int x=(a+2<=b)?arr[a+2][b]:0;
                int y=(a+1<=b-1)?arr[a+1][b-1]:0;
                int z=(a<=b-2)?arr[a][b-2]:0;

                arr[a][b]=Math.max(coins[a]+Math.min(x,y),
                                    coins[b]+Math.min(y,z));
            }
        }

        return arr[0][n-1];
    }
}




