import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] copyAndReverse(int[] arr, int n) {
        // Write your code here.
        int revarr[] = new int[n];
        int index=n-1;

        for(int i=0; i<n; i++){
            revarr[i]=arr[index--];
        }

        return revarr;
    }
}
