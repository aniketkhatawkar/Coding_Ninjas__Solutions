import java.util.* ;
import java.io.*; 
public class Solution {
    public static String isPossible(String str, int n) {
        // Write your code here.
        int x=0, y=0;
        int direction=0;

        for(int i=0;i<n; i++){
            char ch=str.charAt(i);

            if(ch=='G') {
                if(direction==0){
                    y++;
                }
                else if(direction==1){
                    x++;
                }
                else if(direction==2){
                    y--;
                }
                else if(direction==3){
                    x--;
                }
            }
            else if(ch=='L'){
                direction=(direction+3)%4;
            }
            else if(ch=='R'){
                direction=(direction+1)%4;
            }
        }

        if(x==0 && y==0 || direction!=0) {
            return "True";
        }

        return "False";
    }
}
