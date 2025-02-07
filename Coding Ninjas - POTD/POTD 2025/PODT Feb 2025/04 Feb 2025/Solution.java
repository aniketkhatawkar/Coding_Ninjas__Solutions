import java.util.* ;
import java.io.*; 
public class Solution {
    public static int goodSubarrays(int arr[], int n,int b) {
        // Write your code here.
        return helper(arr, n, b) - helper(arr, n, b-1);
    }

    public static int helper(int arr[], int n,int k) {
        if(k==0){
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        int i=0, count=0;

        for(int j=0; j<n; j++){
            map.put(arr[j], map.getOrDefault(arr[j],0)+1);

            while(map.size()>k){
                map.put(arr[i], map.get(arr[i])-1);

                if(map.get(arr[i])==0){
                    map.remove(arr[i]);
                }
                i++;
            }

            count+=(j-i+1);
        }

        return count;
    }
}
