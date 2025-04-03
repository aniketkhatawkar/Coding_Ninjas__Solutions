public class Solution {
	public static boolean isValid(String str) {
		 // Write your code here.
		 int n=str.length();

		 if(n<8 || n>15){
			 return false;
		 }

		 String charc="!@#$%^&*()\\_+-[],.<>\"?/";

		 boolean digi=false, upper=false, lower=false, special=false, spec=true;

		 for(int i=0; i<n; i++){
			 int value=str.charAt(i);
			 char ch=str.charAt(i);

			 if(value>=65 && value<=90){
				 upper=true;
			 }
			 else if(value>=97 && value<=122){
				 lower=true;
			 }
			 else if(Character.isDigit(ch)){
				 digi=true;
			 }
			 else if(ch==' '){
				 spec=false;
			 }
			 else if(charc.contains(ch+"")){
				 special=true;
			 }
		 }

		 if(digi && upper && lower && special && spec){
			 return true;
		 }

		 return false;
	}
}

