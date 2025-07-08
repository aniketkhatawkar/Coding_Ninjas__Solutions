import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findFirstRepeatingDigit(String digitPattern) {
        // Write your code here.
        HashMap<Character, Integer> map = new HashMap<>();

        int n=digitPattern.length();

        for(int i=0; i<n; i++){
            char ch=digitPattern.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
            
            if(map.get(ch)>1){
                return Integer.parseInt(ch+"");
            }
        }

        return -1;
    }
}
