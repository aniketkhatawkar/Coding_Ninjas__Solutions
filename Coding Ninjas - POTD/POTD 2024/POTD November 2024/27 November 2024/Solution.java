import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
  public static int findThirdLagrest(ArrayList < Integer > arr) {
    // Write your code here.
    Collections.sort(arr);

    return arr.get(arr.size()-3);
  }
}