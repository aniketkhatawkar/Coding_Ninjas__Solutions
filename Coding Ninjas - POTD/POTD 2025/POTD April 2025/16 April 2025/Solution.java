import java.util.* ;
import java.io.*; 
public class Solution {
	public static ArrayList<Integer> findLeaders(ArrayList<Integer> elements, int n) {
		// Write your code here.
		ArrayList<Integer> ans = new ArrayList<>();
		ans.add(elements.get(n-1));

		int maxi=elements.get(n-1);

		for(int i=n-2; i>=0; i--){
			if(elements.get(i)>maxi){
				ans.add(elements.get(i));
				maxi=Math.max(maxi, elements.get(i));
			}
		}

		int index=ans.size()-1;

		for(int i=0; i<ans.size()/2; i++){
			int temp=ans.get(i);
			ans.set(i, ans.get(index));
			ans.set(index--,temp);
		}

		return ans;
	}
}