import java.util.* ;
import java.io.*; 
/*

    intervals[i][0] = start point of i'th interval
    intervals[i][1] = finish point of i'th interval

*/
public class Solution {
	public static ArrayList<ArrayList<Integer>> mergeIntervals(ArrayList<ArrayList<Integer>> intervals) {
	        // WRITE YOUR CODE HERE
			intervals.sort((a,b)->a.get(0)- b.get(0));

			ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

			for(ArrayList<Integer> interval : intervals){
				if(ans.isEmpty() || ans.get(ans.size()-1).get(1)<interval.get(0)){
					ans.add(new ArrayList<>(interval));
				}
				else {
					ans.get(ans.size()-1).set(1, Math.max(ans.get(ans.size()-1).get(1), interval.get(1)));
				}
			}

			return ans;
	}
}
