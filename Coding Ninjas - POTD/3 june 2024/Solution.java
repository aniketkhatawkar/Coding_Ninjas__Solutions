import java.util.* ;
import java.io.*; 

public class Solution {
    public static int[][] getFinalGrid(int a[][], int n) {
        // Write your code here.
        int arr[][] = new int[n][n];
        int k=0;

        for(int i=0; i<n; i++){
            k=0;
            for(int j=n-1; j>-1; j--, k++){
                if(a[i][j]==1){
                    arr[i][k]=0;
                }
                else {
                    arr[i][k]=1;
                }
            }
        }
        return arr;
    }
}