import java.util.* ;
import java.io.*; 
public class Solution {
	public static int calculateScore(ArrayList<String> matchResult, int n) {
		// Write your code here.
		Stack<Integer> st = new Stack<>();

		for(String op : matchResult){
			if(op.equals("+")){
				int a=st.pop();
				int b=st.peek();

				int sum=a+b;

				st.push(a);
				st.push(sum);
			}
			else if(op.equals("D")){
				int a=st.peek();
				st.push(a*2);
			}
			else if(op.equals("C")){
				st.pop();
			}
			else {
				st.push(Integer.parseInt(op));
			}
		}

		int ans=0;

		for(int ele:st){
			ans+=ele;
		}

		return ans;
	}
}

