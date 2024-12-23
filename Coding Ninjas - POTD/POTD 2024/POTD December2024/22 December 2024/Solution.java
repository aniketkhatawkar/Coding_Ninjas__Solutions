import java.util.* ;
import java.io.*; 
public class Solution {

	static String ini[]={"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	static String sec[]={"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	public static String handleAll(long n) {
		 //Write your code here
		 if(n==0){
			 return "zero";
		 }

		 StringBuilder ans= new StringBuilder();

		 ans.append(helper((int)(n/10000000), "crore"));
		 ans.append(helper((int)(n/100000)%100, "lakh"));
		 ans.append(helper((int)(n/1000)%100, "thousand"));
		 ans.append(helper((int)(n/100)%10, "hundred"));

		 if(n>0 && n%100!=0){
			 ans.append("and ");
		 }

		 ans.append(helper((int)(n%100), ""));

		 return ans.toString().trim();
	}

	public static String helper(int num, String s){

		StringBuilder sb = new StringBuilder();

		if(num>19){
			sb.append(sec[num/10]).append(" ");
			if(num%10!=0){
				sb.append(ini[num%10]).append(" ");
			}
		}
		else if(num>0){
			sb.append(ini[num]).append(" ");

		}
		
		if(num!=0){
				sb.append(s).append(" ");
			}

		return sb.toString();
	}
}