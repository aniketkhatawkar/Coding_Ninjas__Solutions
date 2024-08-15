import java.util.* ;
import java.io.*; 

public class Solution 
{
	public static int countOfStrings(int n, int m)
	{
		// Write your code here
		StringBuffer sb = new StringBuffer();
		Set<String> set = new HashSet<>();
		for(int i=0; i<n; i++){
			sb.append("1");
		}

		set.add(sb.toString());

		for(int i=0; i<m; i++){
			flipodd(sb,n);
			set.add(sb.toString());

			flipall(sb,n);
			set.add(sb.toString());

			flipkth(sb,n);
			set.add(sb.toString());

			flipeven(sb,n);
			set.add(sb.toString());
		}

		return set.size();
		
	}

	public static void flipall(StringBuffer sb, int n){
		for(int i=0; i<n; i++){
			if(sb.charAt(i)=='1'){
				sb.setCharAt(i, '0');
			}
			else {
				sb.setCharAt(i, '1');
			}
		}
	}

	public static void flipodd(StringBuffer sb, int n){
		for(int i=1; i<n; i+=2){
			if(sb.charAt(i)=='1'){
				sb.setCharAt(i, '0');
			}
			else {
				sb.setCharAt(i, '1');
			}
		}
	}

	public static void flipeven(StringBuffer sb, int n){
		for(int i=0; i<n; i+=2){
			if(sb.charAt(i)=='1'){
				sb.setCharAt(i, '0');
			}
			else {
				sb.setCharAt(i, '1');
			}
		}
	}

	public static void flipkth(StringBuffer sb, int n){
		int k=0;
		for(int i=(3*k)+1; i<n; ){
			sb.setCharAt(i, sb.charAt(i)=='1'?'0':'1');
			++k;
			i=(3*k)+1;
		}
	}
}

