import java.util.* ;
import java.io.*; 
public class Solution {
    public static String lookAndSaySequence(int n) {
        // Write your code here
        if(n==1){
            return "1";
        }
        
        String ans="1";

        for(int i=2; i<=n; i++){
            StringBuffer sb = new StringBuffer();

            int count=1;

            for(int j=1; j<ans.length(); j++){
                if(ans.charAt(j)==ans.charAt(j-1)){
                    count++;
                }
                else {
                    sb.append(count).append(ans.charAt(j-1));
                    count=1;
                }
            }
            sb.append(count).append(ans.charAt(ans.length()-1));
            ans=sb.toString();
        }

        return ans;
    }
}