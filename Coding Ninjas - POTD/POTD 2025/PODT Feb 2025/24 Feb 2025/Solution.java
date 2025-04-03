import java.util.* ;
import java.io.*; 
/*

    intervals[i][0] = start point of i'th interval
    intervals[i][1] = finish point of i'th interval

*/
public class Solution {
	public static ArrayList<ArrayList<Integer>> mergeIntervals(ArrayList<ArrayList<Integer>> intervals) {
		// WRITE YOUR CODE HERE
		if(intervals==null || intervals.size()==0){
			return new ArrayList<>();
		}

		intervals.sort(Comparator.comparingInt(a->a.get(0)));

		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		ArrayList<Integer> curr = intervals.get(0);

		for(int i=1; i<intervals.size(); i++){
			ArrayList<Integer> next = intervals.get(i);

			if(curr.get(1)>=next.get(0)){
				curr.set(1, Math.max(curr.get(1), next.get(1)));
			}
			else {
				arr.add(new ArrayList<>(curr));
				curr=next;
			}
		}

		arr.add(new ArrayList<>(curr));
		return arr;
	}
}
