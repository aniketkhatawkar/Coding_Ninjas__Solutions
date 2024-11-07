import java.util.* ;
import java.io.*; 
public class Solution {
    public static String specificOrder(String x, String y) {
        // Write your code here.
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<x.length(); i++){
            map.put(x.charAt(i), map.getOrDefault(x.charAt(i), 0)+1);
        }

        StringBuffer sb = new StringBuffer();

        for(int i=0; i<y.length(); i++){
            int total=0;
            if(map.containsKey(y.charAt(i))){
                total=map.get(y.charAt(i));
            }

            while(total>0){
                sb.append(y.charAt(i));
                total--;
            }

            map.remove(y.charAt(i));
        }

        for(char ch: map.keySet()){
            int total=map.get(ch);

            while(total>0){
                sb.append(ch);
                total--;
            }
        }

        return sb.toString();
    }
}