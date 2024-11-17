import java.util.* ;
import java.io.*; 
public class Solution{
    public static boolean checkMeta(String str1, String str2) {
        // Write your code here.
        int n=str1.length();
        int m=str2.length();
        int count=0;
        ArrayList<Character> arr = new ArrayList<>();
 
        if(n!=m){
            return false;
        }

        for(int i=0; i<n; i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                arr.add(str1.charAt(i));
                arr.add(str2.charAt(i));
                count++;
            }
        }
        
        if(count==2 && arr.get(0)==arr.get(3) && arr.get(1)==arr.get(2)){
            return true;
        }

        return false;
    }
}