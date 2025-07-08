import java.util.* ;
import java.io.*; 
public class Solution {
    public static long titleToNumber(String str)
    {
        long ans=0;

        for(int i=0; i<str.length(); i++){
            ans=ans*26+(str.charAt(i)-'A'+1);
        }

        return ans;
    }
}
