import java.util.* ;
import java.io.*; 
public class Solution {
    public static String findShortestRoute(String str) {
        // Write your code here.
        int x=0, y=0;
        int n=str.length();

        for(int i=0; i<n; i++){
            char c= str.charAt(i);

            if(c=='E'){
                x++;
            }
            else if(c=='W'){
                x--;
            }
            else if(c=='N'){
                y++;
            }
            else {
                y--;
            }
        }

        StringBuffer sb = new StringBuffer();

        while(x>0){
            sb.append("E");
            x--;
        }
    
        while(y>0){
            sb.append("N");
            y--;
        }

        while(y<0) {
            sb.append("S");
            y++;
        }

        while(x<0) {
            sb.append("W");
            x++;
        }

        return sb.toString();
    }
}