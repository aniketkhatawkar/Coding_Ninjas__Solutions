import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> nearestNumbers(int n) {
		// Write Your Code here
		ArrayList<Integer> ans = new ArrayList<>();

		ans.add(getNext(n));
		ans.add(getPre(n));

		return ans;
	}

	private static int getNext(int n){
		int c=n;
		int c0=0;
		int c1=0;

		while((c&1)==0 && c!=0){
			c0++;
			c>>=1;
		}

		while((c&1)==1){
			c1++;
			c>>=1;
		}

		if(c0+c1==31 || c0+c1==0) {
			return -1;
		}

		int p=c0+c1;

		n|=(1<<p);
		n&=~((1<<p)-1);
		n|=(1<<(c1-1))-1;

		return n;
	}

	private static int getPre(int n){
		int temp=n;
		int c0=0;
		int c1=0;

		while((temp&1)==1){
			c1++;
			temp>>=1;
		}

		while((temp&1)==0 && temp!=0){
			c0++;
			temp>>=1;
		}

		if(c0+c1==31 || c0+c1==0) {
			return -1;
		}

		int p=c0+c1;

		n&=((~0)<<(p+1));
		int m=(1<<(c1+1))-1;

		n |= m<<(c0-1);

		return n;
	}
}