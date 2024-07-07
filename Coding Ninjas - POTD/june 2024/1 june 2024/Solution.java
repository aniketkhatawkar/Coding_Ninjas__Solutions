import java.util.* ;
import java.io.*; 
public class Solution
{
    public static void setMatrixOnes(ArrayList<ArrayList<Integer>> MAT, int n, int m)
    {
        // Write your code here.
        //create two sets
        Set<Integer> row=new HashSet<>();
        Set<Integer> col=new HashSet<>();

        //itrate to check which col& row have an 1
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(MAT.get(i).get(j)==1){
                    row.add(i);
                    col.add(j);
                }
            }
        }

        //set that row & col 1 entire
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(row.contains(i) || col.contains(j)){
                    MAT.get(i).set(j, 1);
                }
            }
        }
    }
}
