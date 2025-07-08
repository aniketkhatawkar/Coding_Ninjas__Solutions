import java.util.* ;
import java.io.*; 
public class Solution {
    public static String specificOrder(String x, String y) {
        // Write your code here.
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char ch: x.toCharArray()){
            map.put(ch ,map.getOrDefault(ch, 0)+1);
        }

        StringBuffer sb = new StringBuffer();

        for(int i=0; i<y.length(); i++){
            char ch=y.charAt(i);

            while(map.containsKey(ch) && map.get(ch)>0){
                sb.append(ch);
                map.put(ch ,map.getOrDefault(ch, 0)-1);
            }
        }

        for(char key: map.keySet()){
            while(map.get(key)>0){
                sb.append(key);
                map.put(key ,map.getOrDefault(key, 0)-1);
            }
        }

        return sb.toString();
    }
}