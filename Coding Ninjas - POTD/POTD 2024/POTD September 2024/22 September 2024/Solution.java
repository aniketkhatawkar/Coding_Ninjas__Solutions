import java.util.* ;
import java.io.*; 
public class Solution{ 
    public static int fishEater(int[] fishes) {
        // Write your code here.
        int ans=0;
        int n=fishes.length;

        int max=fishes[0];

        for(int i=0; i<n; i++){
            if(max>fishes[i]){
                ans++;
            }
            else {
                max=fishes[i];
            }
        }

        return n-ans;
    }
}