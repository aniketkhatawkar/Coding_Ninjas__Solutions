import java.util.* ;
import java.io.*; 
public class Solution{
    public static boolean checkMeta(String str1, String str2) {
        // Write your code here.
        int n=str1.length();
        int m=str2.length();

        if(n!=m){
            return false;
        }

        ArrayList<Character> arr1 = new ArrayList<>();
        ArrayList<Character> arr2 = new ArrayList<>();

        int j=0;

        for(int i=0; i<n; i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                arr1.add(str1.charAt(i));
                arr2.add(str2.charAt(i));
            }
        }

        if(arr1.size()>2 || arr1.size()<2){
            return false;
        }
        else if(arr1.get(0)==arr2.get(1) && arr1.get(1)==arr2.get(0)){
            return true;
        }

        return false;
    }
}