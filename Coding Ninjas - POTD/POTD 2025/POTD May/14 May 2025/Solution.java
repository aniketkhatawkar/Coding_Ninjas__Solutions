import java.util.* ;
import java.io.*; 
public class Solution {

    public static int maxXor(int L, int R) {
        
        // Write your Code here
        int ans=L^R;
        int count=0;

        while(ans>0){
            count++;
            ans>>=1;
        }

        return (1<<count)-1;

     //    unoptimize

	//    int ans=0;

     //    for(int i=L; i<=R; i++){
     //        for(int j=i+1; j<=R; j++){
     //            ans=Math.max(ans, i^j);
     //        }
     //    }

     //    return ans;
    }
}