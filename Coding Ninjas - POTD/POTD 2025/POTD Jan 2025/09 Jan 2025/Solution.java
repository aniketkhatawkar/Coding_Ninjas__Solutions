import java.util.* ;
import java.io.*; 

public class Solution {
    public static int[][] getFinalGrid(int a[][], int n) {
        // Write your code here.

        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++) {
                int temp=a[i][j];
                a[i][j]=a[i][n-j-1];
                a[i][n-j-1]=temp;
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) {
                a[i][j]=a[i][j]==1?0:1;
            }
        }

        return a;
    }
}