import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static int countNumberOfPalindromeWords(String s) 
	{
        // Write your code here!
        String arr[] = s.split(" ");

        int count=0;

        for(int i=0; i<arr.length; i++){

            String word=arr[i].replaceAll("[^a-zA-Z]", "").toLowerCase();
            if(!word.isEmpty() && ispali(word)){
                count++;
            }
        }

        return count;
    }

    public static boolean ispali(String str1){
        int s=0, end=str1.length()-1;
        String str=str1.toLowerCase();

        while(s<=end){
            if(str.charAt(s++)!=str.charAt(end--)){
                return false;
            }
        }

        return true;
    }
}
