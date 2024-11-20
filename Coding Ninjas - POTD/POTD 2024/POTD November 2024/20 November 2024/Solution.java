import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] matrixRangeSum(int[][] grid, int[][] queries)  {
        // Write your code here.
        ArrayList<Integer> arr = new ArrayList<>();

        for(int q[]: queries){
            if(q[0]==2){
                grid[q[1]][q[2]]=q[3];
            }
            else {
                int sum=0;
                for(int i=q[1]; i<=q[3]; i++){
                    for(int j=q[2]; j<=q[4]; j++){
                        sum+=grid[i][j];
                    }
                }
                arr.add(sum);
            }
        }

        return arr.stream().mapToInt(i->i).toArray();
    }
}