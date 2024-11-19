import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		java.util.Scanner input = new Scanner(System.in);

		int num=input.nextInt();
		int a=0;
		int b=1;
		int c=1;

		for(int i=1; i<num; i++){
			c=a+b;
			a=b;
			b=c;
		}

		System.out.println(c);
	}

}
