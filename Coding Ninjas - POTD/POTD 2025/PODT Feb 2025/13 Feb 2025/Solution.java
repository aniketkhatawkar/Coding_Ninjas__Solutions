
public class Solution {

	public static String stringReformat(String s, int k) {
		// Write your code here	
		StringBuffer sb = new StringBuffer();

		for(char c: s.toCharArray()){
			if(c!='-'){
				sb.append(Character.toUpperCase(c));
			}
		}

		int n=sb.length();
		int fg=n%k;

		StringBuffer ans = new StringBuffer();
		int index=0;

		if(fg>0){
			ans.append(sb.substring(0, fg));
			index+=fg;

			if(index<n){
				ans.append("-");
			}
		}

		while(index<n){
			ans.append(sb.substring(index, index+k));
			index+=k;

			if(index<n){
				ans.append("-");
			}
		}

		return ans.toString();
	}

}
