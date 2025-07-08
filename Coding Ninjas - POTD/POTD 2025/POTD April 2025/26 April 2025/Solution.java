public class Solution {
    public static int NthRoot(int n, int m) {
        // Write your code here.
        int ans=0, start=1, end=m;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(Math.pow(mid, n)==m){
                return mid;
            }
            
            if(Math.pow(mid, n)<m){
                start= mid+1;
            }
            else {
                end=mid-1;
            }
        }

        return -1;
    }
}
