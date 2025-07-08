import java.util.* ;
import java.io.*; 
public class Solution{
    public static boolean checkMeta(String str1, String str2) {
        // Write your code here.
        ArrayList<Character> arr = new ArrayList<>();

        if(str1.equals(str2) || str1.length()!=str2.length()){
            return false;
        }

        int count=0;

        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                count++;
                arr.add(str1.charAt(i));
                arr.add(str2.charAt(i));
            }
        }

        if(count==2 && (arr.get(0)==arr.get(3) && arr.get(1)==arr.get(2))){
            return true;
        }

        return false;
    }
}