import java.util.* ;
import java.io.*; 
public class Solution{
    public static boolean checkMeta(String str1, String str2) {
        // Write your code here.
        if(str1.length()!=str2.length()){
            return false;
        }

        List<Integer> al = new ArrayList<>();

        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                al.add(i);
            }
        }

        if(al.size()==2){
            int i=al.get(0);
            int j=al.get(1);

            if(str1.charAt(i)==str2.charAt(j) && str1.charAt(j)==str2.charAt(i)){
                return true;
            }
        }

        return false;

    }
}