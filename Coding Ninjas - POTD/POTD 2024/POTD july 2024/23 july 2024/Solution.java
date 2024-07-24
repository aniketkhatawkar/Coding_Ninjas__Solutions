import java.util.* ;
import java.io.*; 
import  java.util.ArrayList;

public class Solution {
    public static int gridOverlap(ArrayList<ArrayList<Integer>> mat1, ArrayList<ArrayList<Integer>> mat2, int n)  {
        // Write your code here
        int maxoverlap=0;

        for(int dx=-n+1; dx<n; dx++){
            for(int dy = -n+1; dy<n; dy++){
                maxoverlap=Math.max(maxoverlap, caloverlap(mat1, mat2, dx, dy, n));
            }
        }

        return maxoverlap;
    }

    private static int caloverlap(ArrayList<ArrayList<Integer>> mat1, ArrayList<ArrayList<Integer>> mat2, int dx, int dy, int n){
        int overlap=0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int x=i+dx;
                int y=j+dy;

                if(x>=0 && x<n && y>=0 && y<n){
                    if(mat1.get(i).get(j)==1 && mat2.get(x).get(y)==1){
                        overlap++;
                    }
                }

            }
        }

        return overlap;
    }
}