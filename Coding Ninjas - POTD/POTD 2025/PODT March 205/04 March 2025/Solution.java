import java.util.* ;
import java.io.*; 
public class Solution {
    public static Boolean splitString(String str1) {
        // Write your code here..
        int n=str1.length();

        int sec=n/2;
        int count1=0, count2=0;

        String str= str1.toLowerCase();

        for(int i=0; i<n/2; i++, sec++){
            if(str.charAt(i)=='a' || str.charAt(i)=='u' || str.charAt(i)=='o' || str.charAt(i)=='e' || str.charAt(i)=='i'){
                count1++;
            }

            if(str.charAt(sec)=='a' || str.charAt(sec)=='u' || str.charAt(sec)=='o' || str.charAt(sec)=='e' || str.charAt(sec)=='i'){
                count2++;
            }
        }

        if(count1==count2){
            return true;
        }

        return false;
    }

}