import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] rearrangeArray(int[] A, int m) {
        // Write your code here
        int n=A.length;
        Integer arr[]= new Integer[n];

        for(int i=0; i<n; i++){
            arr[i]=i;
        }

        Arrays.sort(arr, (i,j)-> {
            int d1=Math.abs(A[i]-m);
            int d2=Math.abs(A[j]-m);

            if(d1!=d2){
                return d1-d2;
            }

            return i-j;
        });

        int ans[]=new  int[n];

        for(int i=0; i<n; i++){
            ans[i]=A[arr[i]];
        }

        return ans;
    }
}