public class Solution {
    public static int calcGCD(int n, int m){
        // Write your code here.
        int maxi=Math.max(n, m);
        int ans=1;

        if(n==m){
            return m;
        }

        for(int i=2; i<=maxi/2; i++){
            if(n%i==0 && m%i==0){
                ans=i;
            }
        }

        return ans;
    }
}