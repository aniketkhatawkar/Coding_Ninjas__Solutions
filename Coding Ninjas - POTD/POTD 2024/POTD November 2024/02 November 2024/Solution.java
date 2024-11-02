public class Solution {
	public static boolean isValid(String str) {
		 // Write your code here.
		 int len=str.length();

		 if(len<8 || len>15){
			 return false;
		 }

		 String spechar="!@#$%^&*()_+-={}[]<>?,./\\\"\'";

		 boolean digit=false, lowerch=false, upperch=false, specich=false;

		 for(int i=0; i<len; i++){
			 char ch = str.charAt(i);

			 if(ch>=65 && ch<=90){
				 upperch=true;
			 }
			 else if(ch>=97 && ch<=122){
				 lowerch=true;
			 }
			 else if(ch>=48 && ch<=57){
				 digit=true;
			 }
			 else if(ch==32){
				 return false;
			 }
			 else if(spechar.contains(String.valueOf(ch)) && !specich){
				 specich=true;
			 }
		 }

		if(digit && lowerch && upperch && specich){
			return true;
		}

		return false;
	}
}

