import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<ArrayList<Integer>> intersectionIntervals(ArrayList<ArrayList<Integer>> interval1, ArrayList<ArrayList<Integer>> interval2, int n1, int n2) {
		// Write your code here.
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

    int i=0, j=0;

    while(i<n1 && j<n2){
      int start1=interval1.get(i).get(0);
      int end1=interval1.get(i).get(1);
      int start2=interval2.get(j).get(0);
      int end2=interval2.get(j).get(1);

      int startmax=Math.max(start1, start2);
      int endmin=Math.min(end1, end2);

      if(startmax<=endmin){
        ans.add(new ArrayList<>(Arrays.asList(startmax, endmin)));
      }

      if(end1<end2){
        i++;
      }
      else {
        j++;
      }
    }

    return ans;
    }
}