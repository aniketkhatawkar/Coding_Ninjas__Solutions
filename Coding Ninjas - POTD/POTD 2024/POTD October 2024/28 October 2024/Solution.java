import java.util.* ;
import java.io.*; 
public class Solution {
    public static long titleToNumber(String str)
    {
        long ans=0;
        int n=str.length();

        for(int i=0; i<n; i++){
            int val=str.charAt(i)-'A'+1;
            ans=ans*26+val;
        }

        return ans;
    }
}
