import java.util.* ;
import java.io.*; 
public class Solution {
    public static String[] arrangeAuthors(String[][] S) {
        // Write your code here
        int n=S.length;

        ArrayList<String> al= new ArrayList<>(); 

        for(int i=0; i<n; i++){
            StringBuffer sb = new StringBuffer();
            sb.append(i+1+". ");
            sb.append(S[i][0]);

            al.add(sb.toString());

            for(int j=1; j<S[i].length; j++){
                sb=new StringBuffer();

                sb.append("\t");
                sb.append((char) ('A'+j-1) + ". ");
                sb.append(S[i][j]);
                al.add(sb.toString());
            }
        }

        return al.toArray(new String[0]);
    }
}
