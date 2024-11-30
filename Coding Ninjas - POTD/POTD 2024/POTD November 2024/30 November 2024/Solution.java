import java.util.* ;
import java.io.*; 
public class Solution {
    public static Boolean splitString(String str1) {
        // Write your code here..
        int n=str1.length();
        String str= str1.toLowerCase();

        int count1=0;
        int count2=0;

        for(int i=0; i<n/2; i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count1++;
            }
        }

        for(int i=n/2; i<n; i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count2++;
            }
        }

        if(count1==count2){
            return true;
        }
        
        return false;
    }

}