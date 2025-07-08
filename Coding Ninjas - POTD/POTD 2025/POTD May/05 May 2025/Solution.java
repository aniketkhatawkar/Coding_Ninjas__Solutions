import java.util.* ;
import java.io.*; 

public class Solution {

    public static int minimizeIt(int[] A,int K) {
        // Write your code here.
        int n=A.length;
        Arrays.sort(A);

        int ans=A[n-1]-A[0], sm=A[0]+K, lr=A[n-1]-K;

        for(int i=1; i<n; i++){
            if((A[i]-K)>0){
                int mini=Math.min(A[i]-K, sm);
                int maxi=Math.max(A[i-1]+K,lr);
                ans=Math.min(ans, maxi-mini);
            }
        }

        
        return ans;

    }
}