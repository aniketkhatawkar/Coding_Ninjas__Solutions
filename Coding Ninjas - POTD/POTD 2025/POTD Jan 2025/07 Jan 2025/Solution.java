import java.util.* ;
import java.io.*; 
public class Solution {
    public static String zigZagString(String str, int n, int m) {
        // Write your code here.
        if(m==1){
            return str;
        }

        StringBuffer sb[] = new StringBuffer[m];

        for(int i=0; i<m; i++){
            sb[i]=new StringBuffer();
        }

        int curr=0;
        boolean flag=true;

        for(int i=0; i<n; i++){
            sb[curr].append(str.charAt(i));

            if(curr==0){
                flag=true;
            }
            else if(curr==m-1){
                flag=false;
            }

            curr+=flag? 1:-1;
        }

        StringBuffer ans= new StringBuffer();

        for(StringBuffer sbs: sb){
            ans.append(sbs);
        }

        return ans.toString();
    }
}
