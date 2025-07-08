import java.util.* ;
import java.io.*; 
import  java.util.ArrayList;

public class Solution {
    public static int gridOverlap(ArrayList<ArrayList<Integer>> mat1, ArrayList<ArrayList<Integer>> mat2, int n)  {
        // Write your code here
        int ans=0;

        for(int i=-n+1; i<n; i++){
            for(int j=-n+1; j<n; j++){
                int lap=0;

                for(int a=0; a<n; a++){
                    for(int b=0; b<n; b++){
                        int row=i+a;
                        int col=j+b;

                        if(row>=0 && row<n && col>=0 && col<n){
                            if(mat1.get(a).get(b)==1 && mat2.get(row).get(col)==1){
                                lap++;
                            }
                        }
                    }
                }

                ans=Math.max(ans, lap);
            }
        }

        return ans;
    }
}