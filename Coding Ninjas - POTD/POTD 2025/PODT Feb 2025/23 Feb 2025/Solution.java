import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static boolean isArmstrong(int num)
	{
	    // wrtie your code here;
		int ans=0;
		int temp=num;

		ArrayList<Integer> arr = new ArrayList<>();
		int count=0;

		while(num>0){
			count++;
			arr.add(num%10);
			num/=10;
		}

		for(int ele: arr){
			ans+=Math.pow(ele,count);
		}

		return ans==temp ? true : false;
	}
}

