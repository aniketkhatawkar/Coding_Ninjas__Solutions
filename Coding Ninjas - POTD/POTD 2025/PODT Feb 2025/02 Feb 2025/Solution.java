public class Solution {
	public static boolean isValid(String str) {
		 // Write your code here.
		 int n=str.length();

		 if(n<8 || n>15){
			 return false;
		 }

		 boolean isupper=false;
		 boolean islower=false;
		 boolean isdigit=false;
		 boolean isspecial=false;
		 boolean isspace=false;

		 String special="!@#$%^&*~`()\"{}\'[]-+|;:<>,./?\\";

		 for(int i=0; i<n; i++){
			 if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				 isdigit=true;
			 }
			 else if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
				 isupper=true;
			 }
			 else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
				 islower=true;
			 }
			 else if(str.charAt(i)==' '){
				 isspace=true;
			 }
			 else if(special.contains(str.charAt(i)+"")){
				 isspecial=true;
			 }
		 }

		 if(isupper && islower && isdigit && isspecial && !isspace){
			 return true;
		 }

		 return false;
	}
}

