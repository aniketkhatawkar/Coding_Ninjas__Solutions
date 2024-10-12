import java.util.* ;
import java.io.*; 


public class Solution {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int ans[]= new int[n];
        int temp=arr[0];
        
        for(int i=0; i<n-1; i++){
            ans[i]=arr[i+1];
        }

        ans[n-1]=temp;

        return ans;
    }
}