public class Solution {
    public static int NthRoot(int n, int m) {
        // Write your code here.
        if(n==1){
            return m;
        }

        if(m==1){
            return 1;
        }

        int low=1, high=m;

        while(low<=high){
            int mid=low+(high-low)/2;
            long power=(long)Math.pow(mid,n);

            if(power==m){
                return mid;
            }
            else if(power<m){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }

        return -1;
    }
}
