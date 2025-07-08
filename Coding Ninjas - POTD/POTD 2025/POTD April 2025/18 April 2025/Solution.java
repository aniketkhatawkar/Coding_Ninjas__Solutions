import java.util.* ;
import java.io.*; 
public class Solution {

    public static int maximumWeightRow(int n, int m, int[][] mat) {
        // Write your code here.
        int ans=0;

        for(int i=0; i<n; i++){
            int curr=0;
            for(int j=0; j<m; j++){
                curr+=mat[i][j];
            }

            ans=curr>ans?curr:ans;
        }

        return ans;
    }
}