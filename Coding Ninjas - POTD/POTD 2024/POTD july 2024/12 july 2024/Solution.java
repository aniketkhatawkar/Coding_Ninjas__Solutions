import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean isPeriodic(String s) {
        // Write your code here.
        int n=s.length();

        for(int i=1; i<=n/2; i++){
            boolean flag=true;

            for(int j=i; j<n; j++){
                if(s.charAt(j) != s.charAt(j-i)){
                    flag=false;
                    break;
                }
            }

            if(flag){
                return true;
            }
        }

        return false;
    }
}
