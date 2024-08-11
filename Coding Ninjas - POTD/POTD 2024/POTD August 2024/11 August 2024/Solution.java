import java.util.* ;
import java.io.*; 

class Solution {

  public static String stringReverse(char[] arr) {
    // Write your code here.

    StringBuffer sb = new StringBuffer();

    int n=arr.length;

    for(int i=n-1; i>-1; i--){
      sb.append(arr[i]);
    }

    return sb.toString();

  }
}