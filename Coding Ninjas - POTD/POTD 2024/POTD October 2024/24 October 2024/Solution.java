import java.util.HashMap;

public class Solution {
    public static int findMaxFruits(int []arr, int n) {
        // Write your code here.
        HashMap<Integer, Integer> map = new HashMap<>();

        int start=0;
        int max=0;

        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);

            while(map.size()>2){
                map.put(arr[start], map.get(arr[start])-1);

                if(map.get(arr[start])==0){
                    map.remove(arr[start]);
                }
                start++;
            }

            max=Math.max(max, i-start+1);
        }

        return max;
    }
}