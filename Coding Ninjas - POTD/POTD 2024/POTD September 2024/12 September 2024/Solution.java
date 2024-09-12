import java.util.* ;
import java.io.*; 

public class Solution {
    
  public static List<String> matchSpecificPattern(List<String> words, int n, String pattern) {
        
    // Write you code here.
    List<String> list = new ArrayList<>();

    for(String str: words){

      if(str.length()==pattern.length()){

        HashMap<Character, Character> map1= new HashMap<>();
        HashMap<Character, Character> map2= new HashMap<>();

        boolean flag = true;

        for(int i=0; i<str.length(); i++){

          char wchar=str.charAt(i);
          char pchar=pattern.charAt(i);
          
          if(map1.containsKey(wchar)){
            if(map1.get(wchar)!=pchar){
              flag=false;
              break;
            }
          }
          else {
            map1.put(wchar,pchar);
          }

          if(map2.containsKey(pchar)){
            if(map2.get(pchar)!=wchar){
              flag=false;
              break;
            }
          }
          else {
            map2.put(pchar,wchar);
          }
        }
        if(flag){
          list.add(str);
        }
      }
    }

    return list;

  }

}
