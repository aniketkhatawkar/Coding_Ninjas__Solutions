import java.util.* ;
import java.io.*; 
public class Solution {
    public static String specificOrder(String x, String y) {
        // Write your code here.
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch:x.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        StringBuffer sb = new StringBuffer();

        for(char ch:y.toCharArray()){
            if(map.containsKey(ch)){
                int count=map.get(ch);
                while(count-->0){
                    sb.append(ch);
                }
                map.remove(ch);
            }
        }

        for(char ch:x.toCharArray()){
            if(map.containsKey(ch)){
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}