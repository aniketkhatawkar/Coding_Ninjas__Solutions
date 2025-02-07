import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static int countNumberOfPalindromeWords(String s) 
	{
        // Write your code here!
        String arr[] = s.split("\\s+");

        int ans=0;

        for(int i=0; i<arr.length; i++){
            if(!arr[i].isEmpty() && helper(arr[i].toLowerCase())){
                ans++;
            }
        }

        return ans;
    }

    public static boolean helper(String str){
        int n=str.length();

        int end=n-1;
        for(int i=0; i<n/2; i++){
            if(str.charAt(i)!=str.charAt(end--)){
                return false;
            }
        }

        return true;
    }
}