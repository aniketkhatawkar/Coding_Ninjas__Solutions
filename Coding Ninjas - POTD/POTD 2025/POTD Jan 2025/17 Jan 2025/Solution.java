import java.util.* ;
import java.io.*; 
public class Solution {
	public static ArrayList<Integer> findLeaders(ArrayList<Integer> elements, int n) {
		// Write your code here.
		ArrayList<Integer> list = new ArrayList<>();
		int maxi=Integer.MIN_VALUE;

		for(int i=n-1; i>-1; i--){
			if(elements.get(i)>maxi){
				list.add(elements.get(i));
			}

			maxi=Math.max(maxi, elements.get(i));
		}
		Collections.reverse(list);

		return list;
	}
}