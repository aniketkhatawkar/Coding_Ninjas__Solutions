import java.util.* ;
import java.io.*; 
public class Solution {
    public static int ninjaAndTriangle(int n) {
        // Write your code here.
        int count=0;
        int rem=n;

        for(int i=1; i<=n; i++){
            if(rem>=i){
                rem-=i;
                count++;
            }
            else {
                break;
            }
        }

        return count;
    }
}
