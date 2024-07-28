import java.util.* ;
import java.io.*; 

public class Solution {

    public static int rounds(int a,int b) {
        //Write your code here
        int moves=0;

        for(int i=b+1; i<=a; i++){
            int num=i;

            for(int j=2; j*j<=num; j++){
                while(num%j==0){
                    moves++;
                    num/=j;
                }
            }

            if(num>1){
                moves++;
            }
        }

        return moves;
        
    }
}