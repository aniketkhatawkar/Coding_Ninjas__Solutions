import java.util.* ;
import java.io.*; 
public class Solution {

    public static int chessTournament(int[] positions, int n,  int c) 
	{
        // Write your code here.  
        Arrays.sort(positions);
        
        int left=0;
        int right=positions[n-1] - positions[0];
        int result=0;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(helper(positions, n, c, mid)){
                result=mid;
                left=mid+1;
            } else {
                right=mid-1;
            }
        } 

        return result;
    }

    public static boolean helper(int[] positions, int n,  int c, int min){
        int count=1;
        int last=positions[0];

        for(int i=1; i<n; i++){
            if(positions[i]-last>=min){
                count++;
                last=positions[i];
            }

            if(count>=c){
                return true;
            }
        }

        return false;
    }

}