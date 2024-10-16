import java.util.* ;
import java.io.*; 
public class Solution {
	public static void sortOddEven(int[] nums) {
		// Write your code here.
		ArrayList<Integer> odd = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();

		int n=nums.length;

		for(int i=0; i<n; i++){
			if(nums[i]%2==0){
				even.add(nums[i]);
			}
			else {
				odd.add(nums[i]);
			}
		}

		Collections.sort(odd , Collections.reverseOrder());
		Collections.sort(even);

		int index=0;

		for(int ele: odd){
			nums[index++]=ele;
		}

		for(int ele: even){
			nums[index++]=ele;
		}
	}
}