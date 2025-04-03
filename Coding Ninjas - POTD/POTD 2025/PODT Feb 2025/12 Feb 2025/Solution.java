import java.util.* ;
import java.io.*; 
public class Solution {
    public static int kthSmallest(ArrayList<Integer> v, int n, int k) {
        // Write your code here.
        Collections.sort(v);

        return v.get(k-1);
    }
}