import java.util.* ;
import java.io.*; 
public class Solution {
  public static int hotelBookings(List<String> queries)
  {
      // Write your code here.

      ArrayList<String> al = new ArrayList<>();

      int count=0;

      for(String str : queries){
        if(str.charAt(0)=='+' && !al.contains(str)){
          count++;
          al.add(str);
        }
        else if(str.charAt(0)=='-' && al.contains(new String("+"+str.charAt(1)+str.charAt(2)))){
          al.remove(new String("+"+str.charAt(1)+str.charAt(2)));
        }
      }

      return count;
  }
}