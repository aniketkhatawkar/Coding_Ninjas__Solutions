import java.util.* ;
import java.io.*; 
public class Solution{
	public static String convertString(String str) {
            // Write your code here
            String arr[]=str.split(" ");
            StringBuffer sb = new StringBuffer();

            for(String s:arr){
                if(s.length()==1){
                    sb.append(s.toUpperCase()+" ");
                }
                else {
                    sb.append(Character.toUpperCase(s.charAt(0)));
                    sb.append(s.substring(1,s.length())+" ");
                }
            }

            return sb.toString();
        }

}