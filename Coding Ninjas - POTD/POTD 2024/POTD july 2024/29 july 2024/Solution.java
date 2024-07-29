import java.util.* ;
import java.io.*; 
public class Solution {

    public static int maximumWeightRow(int n, int m, int[][] mat) {
        // Write your code here.
        int ans=0, curr=0;

        for(int i=0; i<n; i++){
            curr=0;
            
            for(int j=0; j<m; j++){
                curr+=mat[i][j];
            }
            ans=Math.max(ans, curr);
        }

        return ans;
    }
}