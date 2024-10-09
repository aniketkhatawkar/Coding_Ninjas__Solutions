import java.util.ArrayList;
import java.util.HashMap;

public class Solution {

	public static int findDuplicate(ArrayList<Integer> arr) {

		//    Write your code here.
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int value:arr) {
			map.put(value, map.getOrDefault(value, 0)+1);
			if(map.get(value)>1){
				return value;
			}
		}

		return 0;
	}
}