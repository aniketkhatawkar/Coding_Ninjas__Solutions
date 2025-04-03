import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> absDiff(ArrayList<Integer> arr, int n) {
		// Write your code here.
		int ans1=0, ans2=0;

		if(n==1){
			return new ArrayList<>(Arrays.asList(arr.get(0), 0));
		}

		if(n==2){
			return new ArrayList<>(Arrays.asList(arr.get(0), arr.get(1)));
		}

		ans1=arr.get(0);
		ans2=arr.get(1);

		for(int i=2; i<n; i++){
			if(i%2==0){
				ans1=Math.abs(ans1-arr.get(i));
			}
			else {
				ans2=Math.abs(ans2-arr.get(i));
			}
		}

		ArrayList<Integer> res = new ArrayList<>();

		res.add(ans1);
		res.add(ans2);

		return res;
	}
}