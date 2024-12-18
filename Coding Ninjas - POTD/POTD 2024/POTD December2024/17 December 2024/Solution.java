import java.util.* ;
import java.io.*; 
public class Solution {
	public static String toBinaryCalculator(double num) {
		// Write Your Code here
		if(num<=0 && num>=1){
			return "ERROR";
		}

		StringBuilder sb = new StringBuilder("0.");

		while(num>0){
			if(sb.length()>=34) {
				return "ERROR";
			}

			num*=2;

			if(num>=1){
				sb.append("1");
				num-=1;
			}
			else {
				sb.append("0");
			}
		}

		return sb.toString();
	}
}