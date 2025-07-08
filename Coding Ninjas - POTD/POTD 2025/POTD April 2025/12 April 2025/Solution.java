import java.util.* ;
import java.io.*; 
public class Solution {
    public static int minTransactions(int k, int[] arr) {
        // Write your code here.
        int n=arr.length;
        int sum=0;

        for(int ele : arr){
            sum+=ele;
        }

        if(sum%n!=0){
            return -1;
        }

        int avg=sum/n;
        int ans=0;

        for(int ele : arr){
            int temp=ele-avg;

            if(temp%k!=0){
                return -1;
            }

            ans+=Math.max(temp/k, 0);
        }

        return ans;
    }
}