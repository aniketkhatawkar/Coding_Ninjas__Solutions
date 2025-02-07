import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int groupsOfK(ArrayList<String> strList, int k){
		// Write your code here.4
		int n=strList.size();

		HashMap<String, Integer> map = new HashMap<>();

		for(int i=0; i<n; i++){
			for(int j=0; j<strList.get(i).length(); j++){
				String str=strList.get(i).substring(0, j+1);
				map.put(str, map.getOrDefault(str, 0)+1);
			}
		}

		int ans=0;

		for(String key:map.keySet()){
			int value=map.get(key);
			ans+=(value/k);
		}

		return ans;
	}
}