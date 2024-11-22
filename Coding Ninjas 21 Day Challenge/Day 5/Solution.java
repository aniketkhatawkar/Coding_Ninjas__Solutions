public class Solution {
    public static int isSorted(int n, int []a) {
        // Write your code here.

        int ans=1;

        for(int i=1; i<n; i++){
            if(a[i-1]>a[i]){
                ans=0;
                break;
            }
        }

        return ans;
    }
}