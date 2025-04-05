import java.util.* ;
import java.io.*; 
public class Solution {
	public static void sortOddEven(int[] nums) {
		// Write your code here.
		ArrayList<Integer> odd = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();

		for(int ele : nums){
			if(ele%2==0){
				even.add(ele);
			}
			else {
				odd.add(ele);
			}
		}

		int n=odd.size();
		int m=even.size();

		Collections.sort(odd, Collections.reverseOrder());
		Collections.sort(even);

		for(int i=0; i<n; i++){
			nums[i]=odd.get(i);
		}

		int index=0;

		for(int i=n; i<(n+m); i++){
			nums[i]=even.get(index++);
		}
	}
}