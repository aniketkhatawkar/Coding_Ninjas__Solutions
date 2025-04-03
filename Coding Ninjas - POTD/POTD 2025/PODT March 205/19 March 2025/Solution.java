import java.util.* ;
import java.io.*; 
public class Solution {

    public static int chessTournament(int[] positions, int n,  int c) 
	{
        // Write your code here.  
        Arrays.sort(positions);
        int l=0,r=positions[n-1]-positions[0];

        while(l<=r){
            int mid=(l+r)/2;
            if(helper(positions, mid)<c){
                r=mid-1;
            }
            else {
                l=mid+1;
            }
        }

        return r;  
    }

    public static int helper(int arr[], int d){
        int p=1, curr=arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]-curr>=d){
                p++;
                curr=arr[i];
            }
        }

        return p;
    }

}