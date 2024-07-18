import java.util.* ;
import java.io.*; 
public class Solution {
    public static int largestPrimeFactor(int n) {
        // Write your code here.
        int ans=-1;

        for(int i=2; i*i<=n; i++){
            while(n%i==0){
                ans=i;
                n/=i;
            }
        }

        if(n>1){
            ans=n;
        }

        return ans;
    }
}
