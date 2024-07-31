import java.util.* ;
import java.io.*; 
public class Solution {
    private static int[][] inputgrid;
    private static int[][] prefixsum;
    private static int n,m;

    public static int[] matrixRangeSum(int[][] grid, int[][] queries)  {
        // Write your code here.
        inputgrid=grid;
        n=inputgrid.length;
        m=inputgrid[0].length;

        prefixsum=new int [n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                prefixsum[i][j]=inputgrid[i][j];

                if(i>0){
                    prefixsum[i][j]+=prefixsum[i-1][j];
                }

                if(j>0){
                    prefixsum[i][j]+=prefixsum[i][j-1];
                }

                if(i>0 && j>0){
                    prefixsum[i][j]-=prefixsum[i-1][j-1];
                }
            }
        }

        List<Integer> res=new ArrayList<>();

        for(int [] query : queries){
            if(query[0]==1){
                int x1=query[1], y1=query[2], x2=query[3], y2=query[4];
                res.add(getsubmatrixsum(x1, y1, x2, y2));
            }
            else if(query[0]==2){
                int row=query[1], col=query[2], newvalue=query[3];
                updateprefixsum((row), col, newvalue);
            }
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void updateprefixsum(int row, int col, int newvalue){
        int oldvalue=inputgrid[row][col];
        int diff=newvalue-oldvalue;

        inputgrid[row][col]=newvalue;

        for(int i=row; i<n; i++){
            for(int j=col; j<m; j++){
                prefixsum[i][j]+=diff;           
            }
        }
    }

    public static int getsubmatrixsum(int x1, int y1, int x2, int y2) {
        int totalsum=prefixsum[x2][y2];

        if(x1>0){
            totalsum-=prefixsum[x1-1][y2];
        }
        if(y1>0){
            totalsum-=prefixsum[x2][y1-1];
        }
        if(x1>0 && y1>0){
            totalsum+=prefixsum[x1-1][y1-1];
        }

        return totalsum;
    }
}