import java.util.* ;
import java.io.*; 
import java.util.Vector;

public class Solution {
    public static Vector < Integer > chuninNinja(int n, int m, int arr[][]) {
        // Write your code here.
        Vector<Integer> vec = new Vector<>();

        int row[]= new int[n];
        int col[]= new int[m];

        Arrays.fill(row, Integer.MAX_VALUE);
        Arrays.fill(col, Integer.MIN_VALUE);

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                row[i]=Math.min(row[i], arr[i][j]);
                col[j]=Math.max(col[j], arr[i][j]);
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j]==row[i] && arr[i][j]==col[j]){
                    vec.add(arr[i][j]);
                }
            }
        }

        return vec;
    }
}