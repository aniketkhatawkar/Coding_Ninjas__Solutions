import java.util.* ;
import java.io.*; 
public class Solution {

    public static int stringBreaker(String s, int len, String[] dictionary) {
        // Write your code here.
        Set<String> set = new HashSet<>(Arrays.asList(dictionary));

        int n=s.length();
        int arr[]= new int[n+1];

        Arrays.fill(arr, n+1);
        arr[0]=0;

        for(int i=1; i<=n; i++){
            for(int j=i-1; j>=0; j--){
                if(set.contains(s.substring(j, i))){
                    arr[i]=Math.min(arr[i], arr[j]+1);
                }
            }
        }

        return arr[n]<=n?arr[n]-1:-1;
    }

}