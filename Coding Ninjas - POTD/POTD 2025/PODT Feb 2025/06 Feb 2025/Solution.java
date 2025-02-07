import java.util.* ;
import java.io.*; 
public class Solution
{
    public static void setMatrixOnes(ArrayList<ArrayList<Integer>> MAT, int n, int m)
    {
        // Write your code here.
        int row[] = new int[n];
        int col[] = new int[m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(MAT.get(i).get(j)==1){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(row[i]==1 || col[j]==1){
                    MAT.get(i).set(j, 1);
                }
            }
        }
    }
}
