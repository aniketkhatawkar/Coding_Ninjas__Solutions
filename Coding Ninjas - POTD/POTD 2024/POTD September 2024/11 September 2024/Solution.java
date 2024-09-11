import java.util.* ;
import java.io.*; 
public class Solution {
    public static long countOfNumbers(long n) {
		// Write your code here.
		Queue<Long> q = new LinkedList<>();

		q.add(1L);

		long count=0;

		while(!q.isEmpty()){
			long num=q.poll();

			if(num>n){
				continue;
			}

			count++;

			long nextzero=num*10;
			long nextone=num*10+1;

			if(nextone<=n){
				q.add(nextone);
			}

			if(nextzero<=n){
				q.add(nextzero);
			}
		}

		return count;

	}
}