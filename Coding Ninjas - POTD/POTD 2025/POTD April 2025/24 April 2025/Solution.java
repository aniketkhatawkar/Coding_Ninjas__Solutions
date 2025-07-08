import java.util.*;

public class Solution {
    public static int kDistinctSubarrays(int[] arr, int n, int k) {
        // Write your code here.
        return helper(arr, n, k) - helper(arr, n, k-1);
    }

    public static int helper(int[] arr, int n, int k){
        int left=0, count=0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int rigth=0; rigth<n; rigth++){
            map.put(arr[rigth], map.getOrDefault(arr[rigth],0)+1);

            while(map.size()>k){
                map.put(arr[left], map.get(arr[left])-1);

                if(map.get(arr[left])==0){
                    map.remove(arr[left]);
                }

                left++;
            }

            count+=(rigth-left)+1;
        }

        return count;
    }
}