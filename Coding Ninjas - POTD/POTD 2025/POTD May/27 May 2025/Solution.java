import java.util.* ;
import java.io.*; 
public class Solution {

    public static int oneIteration(int[] A) {
        
        // WRite your Code here
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;

        for(int i=0; i<A.length; i++){
            if(A[i]>max1){
                max2=max1;
                max1=A[i];
            }
            else {
                max2=Math.max(max2, A[i]);
            }
        }

        return max1+max2;
    }
}