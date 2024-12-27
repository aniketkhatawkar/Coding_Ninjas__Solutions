import java.util.* ;
import java.io.*; 
public class Solution {
    public static String encodeBase58(int n){
        // Write your code here
        String str="123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz";
        StringBuffer sb = new StringBuffer();

        while(n>0){
            int rem=n%58;
            sb.append(str.charAt(rem));
            n/=58;
        }

        if(sb.length()==0){
            sb.append('1');
        }

        return sb.reverse().toString();
    }
}
