import java.util.* ;
import java.io.*; 
public class Solution {
	public static ArrayList<ArrayList<Integer>> pwset(ArrayList<Integer> arr) {
		// WRITE YOUR CODE HERE
		ArrayList<ArrayList<Integer>> arrlist = new ArrayList<>();

		generet (arr, 0, new ArrayList<Integer>(), arrlist);

		return arrlist;
	}

	private static void generet (ArrayList<Integer> arr, int index, ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> result){
		if(index==arr.size()){
			result.add(new ArrayList<>(curr));
			return;
		}

		generet(arr, index+1, curr, result);
		curr.add(arr.get(index));

		generet(arr, index+1, curr, result);

		curr.remove(curr.size()-1);
	}
}

