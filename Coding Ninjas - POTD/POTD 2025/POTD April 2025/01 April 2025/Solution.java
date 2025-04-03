import java.util.* ;
import java.io.*; 
public class Solution {
    public static int countColumns(String[] strings){
        // Write your code here.
        int n=strings.length;
        int m=strings[0].length();
        int count=0;

        for(int i=0; i<m; i++){
            for(int j=1; j<n; j++){
                if(strings[j].charAt(i)<strings[j-1].charAt(i)){
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}