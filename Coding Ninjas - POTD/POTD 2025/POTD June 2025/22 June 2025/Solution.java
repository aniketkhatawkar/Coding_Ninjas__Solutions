import java.util.* ;
import java.io.*; 
public class Solution {
    public static Boolean isReflectionEqual(String s) {
        // Write your code here.
        int n=s.length();

        String str="AHIOUMTVWXY";

        for(int i=0; i<n; i++){
            if(!str.contains(s.charAt(i)+"")){
                return false;
            }
        }

        for(int i=0; i<n/2; i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                return false;
            }
        }

        return true;
    }
}
