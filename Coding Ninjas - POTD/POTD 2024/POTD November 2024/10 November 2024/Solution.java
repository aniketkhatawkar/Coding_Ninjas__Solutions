import java.util.* ;
import java.io.*; 
public class Solution {
    public static int toggleKBits(int n , int k) {
        // Write your code here.
        return n^((1<<k)-1);
    }
}
