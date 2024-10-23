import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static int swapAdjacent(int n) 
    {
        // Write your code here.
        int oddbit=(n & 0xAAAAAAAA)>>1;
        int evenbit=(n & 0x55555555)<<1;

        return oddbit|evenbit;
    }
}