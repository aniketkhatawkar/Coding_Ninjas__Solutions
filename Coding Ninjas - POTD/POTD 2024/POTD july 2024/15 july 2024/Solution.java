import java.util.* ;
import java.io.*; 
public class Solution {
    public static Boolean splitString(String str) {
        // Write your code here..
        int n=str.length();

        int mid=n/2;

        String s1=str.substring(0, mid);
        String s2=str.substring(mid, n);

        int count1=0;
        int count2=0;

        for(int i=0; i<mid; i++){
            if(getvowel(s1.charAt(i))){
                count1++;
            }
            if(getvowel(s2.charAt(i))){
                count2++;
            }
        }

        if(count2==count1){
            return true;
        }

        return false;
    }

    public static boolean getvowel(char c){
        c=Character.toLowerCase(c);
        
        if(c=='a' || c=='i' || c=='e' || c=='o' ||c=='u'){
            return true;
        }

        return false;
    }

}