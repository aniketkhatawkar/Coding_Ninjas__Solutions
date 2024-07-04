import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findProductSumDifference(int n) {
        // Write your code here
        int sum=0, mul=1;

        while(n>0){
            sum+=n%10;
            mul*=n%10;
            n/=10;
        }

        return mul-sum;
    }
}