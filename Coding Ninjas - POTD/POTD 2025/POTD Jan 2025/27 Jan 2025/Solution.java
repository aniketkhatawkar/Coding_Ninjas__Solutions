import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
	public static int maxFrequencyNumber(int n, int[] arr) {
		// Write your code here
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i=0; i<n; i++){
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}

		int maxi=0;

		for(int key : map.keySet()){
			maxi=Math.max(maxi, map.get(key));
		}

		ArrayList<Integer> list = new ArrayList<>();

		for(int key: map.keySet()){
			if(map.get(key)==maxi){
				list.add(key);
			}
		}

		for(int i=0; i<n; i++){
			if(list.contains(arr[i])){
				return arr[i];
			}
		}

		return -1;
	}
}