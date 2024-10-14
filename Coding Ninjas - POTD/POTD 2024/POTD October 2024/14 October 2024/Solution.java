import java.util.* ;
import java.io.*; 
/*

    intervals[i][0] = start point of i'th interval
    intervals[i][1] = finish point of i'th interval

*/
public class Solution {
	public static ArrayList<ArrayList<Integer>> mergeIntervals(ArrayList<ArrayList<Integer>> intervals) {
	        // WRITE YOUR CODE HERE
			ArrayList<ArrayList<Integer>> al = new ArrayList<>();

			intervals.sort((a,b)-> a.get(0) - b.get(0));
			
			for(ArrayList<Integer> inter : intervals){
				if(al.isEmpty() || al.get(al.size()-1).get(1) < inter.get(0)){
					al.add(inter);
				}
				else {
					al.get(al.size()-1).set(1, Math.max(al.get(al.size()-1).get(1), inter.get(1)));
				}
			}

			return al;
	}
}
