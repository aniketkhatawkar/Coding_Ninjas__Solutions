import java.util.* ;
import java.io.*; 
public class Solution {
  public static int sumOfMaxMin(int[] arr, int n) {
      // Write your code here.
      int mini=Integer.MAX_VALUE;
      int maxi=Integer.MIN_VALUE;

      for(int ele: arr){
        mini=Math.min(mini, ele);
        maxi=Math.max(maxi, ele);
      }

      return mini+maxi;
  }
}