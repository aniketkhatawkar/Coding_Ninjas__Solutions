import java.util.* ;
import java.io.*; 
public class Solution {
    public static int toggleKBits(int n, int m) {
        // Write your code here.
        int temp=(1<<m)-1;

        return n^temp;
    }
}
