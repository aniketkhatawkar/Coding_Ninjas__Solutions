import java.util.* ;
import java.io.*; 
public class Solution
{
    public static void setMatrixOnes(ArrayList<ArrayList<Integer>> MAT, int n, int m)
    {
        // Write your code here.
        boolean row[] = new boolean[n];
        boolean col[] = new boolean[m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(MAT.get(i).get(j)==1){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(row[i] || col[j]){
                    MAT.get(i).set(j, 1);
                }
            }
        }
    }
}
