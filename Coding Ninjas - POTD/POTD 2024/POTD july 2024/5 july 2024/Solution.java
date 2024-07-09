
public class Solution {

    public static int[] getProductArrayExceptSelf(int[] arr) {
    	//Your code goes here
        int n=arr.length;

        if(n==0){
            return new int[0];
        }

        int mod=1000000007;

        int ans[] = new int[n];
        ans[0]=1;

        for(int i=1; i<n; i++){
            ans[i]=(int)(((long)ans[i-1]*arr[i-1])%mod);
        }

        long r=1;

        for(int i=n-1; i>-1; i--){
            ans[i]=(int)((long)(ans[i]*r)%mod);
            r=(r*arr[i])%mod;
        }

        return ans;
    }

}