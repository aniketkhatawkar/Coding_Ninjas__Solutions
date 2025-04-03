import java.util.* ;
import java.io.*; 

public class Solution {
    
    public static List<String> matchSpecificPattern(List<String> words, int n, String pattern) {
        
		// Write you code here.
    List<String> ans = new ArrayList<>();

    String str = getpatt(pattern);

    for(String w : words){
      if(w.length()==pattern.length() && getpatt(w).equals(str)){
        ans.add(w);
      }
    }

    return ans;

    }

    public static String getpatt(String str){
      HashMap<Character, Integer> map = new HashMap<>();

      StringBuilder sb = new StringBuilder();

      int index=0;

      for(char ch : str.toCharArray()){
        map.putIfAbsent(ch, index++);
        sb.append(map.get(ch));
      }

      return sb.toString();
    }

}
