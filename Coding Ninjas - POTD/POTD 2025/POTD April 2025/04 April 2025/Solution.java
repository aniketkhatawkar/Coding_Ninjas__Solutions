import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static int findSum(int n, ArrayList<Integer> arr) {

		// Write your code here
		int sum=0;

		for(int ele : arr){
			if(ele%2==0 || ele%3==0){
				sum+=ele;
			}
		}

		return sum;

	}
}
