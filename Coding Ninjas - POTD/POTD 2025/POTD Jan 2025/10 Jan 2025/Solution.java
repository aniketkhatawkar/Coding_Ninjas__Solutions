import java.util.*;

public class Solution {
    public static int kDistinctSubarrays(int[] arr, int n, int k) {
        // Write your code here.
        return helper(arr, n, k) - helper(arr, n, k-1);
    }

    public static int helper(int[] arr, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int start=0, end=0, count=0;

        while(end<n){
            map.put(arr[end], map.getOrDefault(arr[end], 0)+1);

            while(map.size()==k+1){
                map.put(arr[start], map.get(arr[start])-1);

                if(map.get(arr[start])==0) {
                    map.remove(arr[start]);
                }

                start++;
            }

            count+=end-start+1;
            end++;
        }

        return count;
    }
}