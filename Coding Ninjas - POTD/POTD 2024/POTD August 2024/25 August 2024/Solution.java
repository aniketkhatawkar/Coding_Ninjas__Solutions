import java.util.* ;
import java.io.*; 
public class Solution {

    public static int goodSubarrays(int arr[], int n,int b) {
        // Write your code here.
        return helper(arr, n, b)-helper(arr, n, b-1);

    }
    public static int helper(int arr[], int n,int k) {
        // Write your code here.
        HashMap<Integer , Integer> map =new HashMap<>();

        int left=0, count=0;

        for(int right=0; right<n; right++){
            map.put(arr[right], map.getOrDefault(arr[right], 0)+1);

            while(map.size()>k){
                map.put(arr[left], map.get(arr[left])-1);
                if(map.get(arr[left])==0){
                    map.remove(arr[left]);
                }
                left++;
            }

            count+=right-left+1;
        }
        return count;
    }
}
