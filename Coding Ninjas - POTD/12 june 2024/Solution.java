import java.util.* ;
import java.io.*; 
public class Solution {
    public static int goodSubarrays(int arr[], int n,int b) {
        // Write your code here.
        return findsub(arr, b, n)-findsub(arr, b-1, n);
    }

    static int findsub( int nums[], int k, int n){
        if(k<0) {
            return 0;
        }

        int rigth=0, left=0, count=0;

        HashMap<Integer, Integer> map =new HashMap<>();

        while(rigth<n){
            if(map.containsKey(nums[rigth])){
                map.put(nums[rigth], map.get(nums[rigth])+1);
            }
            else {
                map.put(nums[rigth], 1);
            }

            while(map.size()>k){
                map.put(nums[left], map.get(nums[left])-1);

                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;

            }
            count+=rigth-left+1;
            rigth++;
        }
        return count;
    }
}
