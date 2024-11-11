import java.util.* ;
import java.io.*; 
public class Solution{
	public static String convertString(String str) {
        // Write your code here
        String arr[]=str.trim().split("\\s+");
        int n=arr.length;

        StringBuffer sb = new StringBuffer();

        for(int i=0; i<n; i++){
            sb.append(Character.toUpperCase(arr[i].charAt(0))+arr[i].substring(1, arr[i].length()));
            if(i<n-1){
                sb.append(" ");
            }
        }

        return sb.toString();
    }

}