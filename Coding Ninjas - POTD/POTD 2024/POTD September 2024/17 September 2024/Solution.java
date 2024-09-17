import java.util.* ;
import java.io.*; 
public class Solution
{
    public static String strThree0Three1(int m, int n) 
    {
   		// Write your code here
        
        StringBuffer sb = new StringBuffer();

        while(m>0 || n>0){
            if(m<n){
                if(n>0){
                    sb.append("1");
                    n--;
                }
                if(n>0){
                    sb.append("1");
                    n--;
                }
                if(m>0){
                    sb.append("0");
                    m--;
                }
            }
            else if(m>n){
                if(m>0){
                    sb.append("0");
                    m--;
                }
                if(m>0){
                    sb.append("0");
                    m--;
                }
                if(n>0){
                    sb.append("1");
                    n--;
                }
            }
            else {
                if(n>0){
                    sb.append("1");
                    n--;
                }
                if(m>0){
                    sb.append("0");
                    m--;
                }
            }
        }

        return sb.toString();
    }
}