import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Solution {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		//Write your code here
		ArrayList<Integer> ans= new ArrayList<>();

		Collections.sort(arr);

		ans.add(arr.get(k-1));
		ans.add(arr.get(n-k));

		return ans;
	}
}
