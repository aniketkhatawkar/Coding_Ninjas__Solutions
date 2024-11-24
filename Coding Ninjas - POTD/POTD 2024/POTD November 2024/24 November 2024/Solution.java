import java.util.* ;
import java.io.*; 
public class Solution {
    public static int bitInsertion(int x, int y, int a, int b) {
        // Write your code here
        long allones=~0L;
        long left=allones<<(b+1);
        long right=(1L<<a)-1;

        long mask= left|right;

        long ceardx=x&mask;
        long shiftdx=(long)y<<a;

        return (int)(ceardx|shiftdx);
    }
}
