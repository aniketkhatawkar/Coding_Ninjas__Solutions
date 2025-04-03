import java.util.* ;
import java.io.*; 
public class Solution {
    public static List<Integer> spiralPathMatrix(int[][] matrix, int n, int m) {
        // Write you code here.
        List<Integer> list = new ArrayList<>();

        int top=0, bottom=n-1, left=0, rigth=m-1;

        while(top<=bottom && left<=rigth){
            for(int i=left; i<=rigth; i++){
                list.add(matrix[top][i]);
            }
            top++;

            for(int i=top; i<=bottom; i++){
                list.add(matrix[i][rigth]);
            }
            rigth--;

            if(top<=bottom){
                for(int i=rigth; i>=left; i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<=rigth){
                for(int i=bottom; i>=top; i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }

        return list;
    }
}