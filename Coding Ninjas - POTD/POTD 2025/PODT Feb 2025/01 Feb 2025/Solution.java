import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findFirstRepeatingDigit(String digitPattern) {
        // Write your code here.
        String str=String.valueOf(digitPattern);
        int n=str.length();
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
            if(map.get(str.charAt(i))>1){
                String s=str.charAt(i)+"";
                return Integer.valueOf(s);
            }
        }

        return -1;
    }
}
