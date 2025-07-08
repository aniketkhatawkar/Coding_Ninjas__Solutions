import java.util.* ;
import java.io.*; 
public class Solution {
    public static Boolean splitString(String str) {
        // Write your code here..
        int n=str.length();
        
        str=str.toLowerCase();

        int fsub=0;
        int ssub=0;

        int temp=n/2;

        for(int i=0; i<n/2; i++, temp++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='u' 
            ||str.charAt(i)=='o' || str.charAt(i)=='i'){
                fsub++;
            }

            if(str.charAt(temp)=='a' || str.charAt(temp)=='e' ||str.charAt(temp)=='u' 
            ||str.charAt(temp)=='o' || str.charAt(temp)=='i'){
                ssub++;
            }
        }

        if(fsub==ssub){
            return true;
        }

        return false;
    }

}