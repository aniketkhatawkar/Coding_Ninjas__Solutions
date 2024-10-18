import java.util.* ;
import java.io.*; 
/*************************************************************************
		't' is the time at which the meeting ends.
		'start' is a vector denoting the start time of the ith presentation.
		'end' is a vector denoting the end time of the ith presentation.
		'k' is the maximum number of presentations that can be rescheduled.
*************************************************************************/

import java.util.ArrayList;

public class Solution {
	public static int maxInterval(int t, ArrayList<Integer> start, ArrayList<Integer> end, int k) {
		// Write your code here.
		int n=start.size();
		int sum=0, max=0;
		
		ArrayList<Integer> al= new ArrayList<>();

		al.add(start.get(0)-0);

		for(int i=1; i<n; i++){
			al.add(start.get(i)-end.get(i-1));
		}

		al.add(t-end.get(n-1));

		int j=0;
		k++;

		for(int i=0; i<al.size(); i++){
			sum+=al.get(i);

			if(i-j+1>k){
				sum-=al.get(j);
				j++;
			}

			max=Math.max(max, sum);
		}

		return max;
	}
}