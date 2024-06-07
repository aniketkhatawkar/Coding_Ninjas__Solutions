import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> absDiff(ArrayList<Integer> arr, int n) {
		// Write your code here.
		ArrayList<Integer> al = new ArrayList<>();

        // if array size is 1
		if(n<2){
			al.add(arr.get(0));
			al.add(0);

			return al;
		}

		int even=arr.get(0);
		int odd=arr.get(1);

		for(int i=2; i<n; i+=2){
			even=Math.abs(even-arr.get(i));
		}

		for(int i=3; i<n; i+=2){
			odd=Math.abs(odd-arr.get(i));
		}

		al.add(even);
		al.add(odd);

		return al;
	}
}