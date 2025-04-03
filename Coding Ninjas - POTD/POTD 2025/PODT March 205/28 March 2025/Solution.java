import java.util.*;

public class Solution {

	public static int findDuplicate(ArrayList<Integer> arr) {

		//    Write your code here.
		HashMap<Integer, Integer> map = new HashMap<>();
		int n=arr.size();

		for(int i=0; i<n; i++){
			map.put(arr.get(i), map.getOrDefault(arr.get(i),0)+1);
			if(map.get(arr.get(i))>1){
				return arr.get(i);
			}
		}

		return -1;
	}
}