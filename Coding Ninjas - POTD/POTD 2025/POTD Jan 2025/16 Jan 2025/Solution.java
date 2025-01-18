import java.util.* ;
import java.io.*; 
public class Solution
{
	public static ArrayList<Integer> prevSmall(ArrayList<Integer> arr, int n)
	{
		// Write Your Code Here.
		int mini=arr.get(0);

		ArrayList<Integer> list = new ArrayList<>();
		Stack<Integer> st = new Stack<>();

		for(int i=0; i<n; i++){

			while(!st.isEmpty() && arr.get(st.peek())>=arr.get(i)){
				st.pop();
			}

			if(st.isEmpty()){
				list.add(-1);
			}
			else {
				list.add(arr.get(st.peek()));
			}
			
			st.add(i);
		}

		return list;
	}
}
