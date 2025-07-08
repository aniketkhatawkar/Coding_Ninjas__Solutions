import java.util.* ;
import java.io.*; 
public class Solution {
    public static int ninjaAndTriangle(int n) {
        // Write your code here.
        int index=1;
        int ans=0;

        while(n>=index){
            ans++;
            n-=index;
            ++index;
        }

        return ans;
    }
}
