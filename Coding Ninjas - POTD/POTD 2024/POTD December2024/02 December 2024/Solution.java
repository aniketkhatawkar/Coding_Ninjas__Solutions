import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int groupsOfK(ArrayList<String> strList, int k){
		// Write your code here.
		int n=strList.size();

		HashMap<String, Integer> map = new HashMap<>();

		for(int i=0; i<n; i++){
			for(int j=0; j<strList.get(i).length(); j++){
				String prefix=strList.get(i).substring(0, j+1);
				map.put(prefix, map.getOrDefault(prefix, 0)+1);
			}
		}

		int ans=0;

		for(String str : map.keySet()){
			int count=map.get(str);
			ans+=(count/k);
		}
		return ans;
	}

}