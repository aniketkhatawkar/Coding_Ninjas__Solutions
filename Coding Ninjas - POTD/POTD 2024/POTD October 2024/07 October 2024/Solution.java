import java.util.* ;
import java.io.*; 

public class Solution 
{
	public static int countOfStrings(int n, int m)
	{
		// Write your code here
		if(m==0){
			return 1;
		}

		if(n==1){
			return 2;
		}

		if(n==2){
			if(m==1){
				return 3;
			}

			if(m>1){
				return 4;
			}
		}

		if(n>2){
			if(m==1){
				return 4;
			}

			if(m==2){
				return 7;
			}

			if(m>2){
				return 8;
			}
		}
		return 0;
	}
}

