public class Solution 
{
	public static String addBinaryString(String a, String b, int n, int m)
	{
		// Write your code here.
		StringBuffer sb = new StringBuffer();

		int i=n-1;
		int j=m-1;
		int car=0;

		while(i>=0 || j>=0|| car!=0){
			int bitA=(i>=0)?a.charAt(i)-'0':0;
			int bitB=(j>=0)?b.charAt(j)-'0':0;
			int sum=bitA+bitB+car;

			sb.append(sum%2);
			car=sum/2;

			i--; j--;
			
		}

		return sb.reverse().toString();
	}
}
