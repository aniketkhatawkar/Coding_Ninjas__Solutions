import java.util.* ;
import java.io.*; 
public class Solution {
    public static Boolean isReflectionEqual(String s) {
        // Write your code here.
        int n=s.length();
        String str ="WTYUIOAHXVNM";

        for(int i=0; i<n; i++){
            if(!str.contains(s.charAt(i)+"")){
                return false;
            }
        }

        int end=n-1;

        for(int i=0; i<n/2; i++){
            if(s.charAt(i)!=s.charAt(end--)){
                return false;
            }
        }

        return true;

    }
}
