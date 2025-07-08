import java.util.*;

public class Solution{
    public static int missingNumber(int n, int []arr){
        // Write your code here.
        HashMap<Integer, Integer> map = new HashMap<>();

        int ans=-1;

        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            if(map.get(arr[i])%2==1){
                ans=arr[i];
            }
        }

        return ans;
    }
}