import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findMSB(int n) {
        // Write your code here.
        int i=0;
        int pre=0, curr=0;

        while(curr<=n){
            pre=curr;
            curr=(int)Math.pow(2, i);
            i++;
        }

        return pre;
    }
}