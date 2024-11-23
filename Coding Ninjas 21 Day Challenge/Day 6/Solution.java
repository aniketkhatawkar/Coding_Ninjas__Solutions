public class Solution {
    public static int reverseNumber(int n) {
        // Write your code here
        int ans=0;

        while(n>0){
            ans=ans*10+n%10;
            n/=10;
        }

        return ans;
    }
}