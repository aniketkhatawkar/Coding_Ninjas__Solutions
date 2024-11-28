import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<ArrayList<Integer>> intersectionIntervals(ArrayList<ArrayList<Integer>> interval1, ArrayList<ArrayList<Integer>> interval2, int n1, int n2) {
		// Write your code here.
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

    int i=0; 
    int j=0;

    while(i<n1 && j<n2){
      ArrayList<Integer> a=interval1.get(i);
      ArrayList<Integer> b=interval2.get(j);

      if(a.get(0)<=b.get(1) && b.get(0)<= a.get(1)){
        ArrayList<Integer> inter = new ArrayList<>();
        inter.add(Math.max(a.get(0), b.get(0)));
        inter.add(Math.min(a.get(1), b.get(1)));
        ans.add(inter);
      }

      if(a.get(1)<b.get(1)){
        i++;
      }
      else {
        j++;
      }
    }

    return ans;

    }
}