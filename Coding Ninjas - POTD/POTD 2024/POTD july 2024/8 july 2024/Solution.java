import java.util.HashMap;

public class Solution {
    public static int findMaxFruits(int[] arr, int n) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int maxcount = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);

            while (hash.size() > 2) {
                if (hash.get(arr[count]) == 1) {
                    hash.remove(arr[count]);
                } else {
                    hash.put(arr[count], hash.get(arr[count]) - 1);
                }
                count++;
            }

            maxcount = Math.max(maxcount, i - count + 1);
        }

        return maxcount;
    }
}
