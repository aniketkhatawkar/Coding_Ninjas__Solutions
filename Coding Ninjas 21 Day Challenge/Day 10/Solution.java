import java.util.*;
public class Solution {
    public static int[] getFrequencies(int []v) {
        // Write Your Code Here
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : v) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int highestFrequency = Integer.MIN_VALUE;
        int lowestFrequency = Integer.MAX_VALUE;
        int maxFrequencyElement = Integer.MAX_VALUE;
        int minFrequencyElement = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int element = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > highestFrequency || (frequency == highestFrequency && element < maxFrequencyElement)) {
                highestFrequency = frequency;
                maxFrequencyElement = element;
            }

            if (frequency < lowestFrequency || (frequency == lowestFrequency && element < minFrequencyElement)) {
                lowestFrequency = frequency;
                minFrequencyElement = element;
            }
        }

        return new int[] {maxFrequencyElement, minFrequencyElement};
    }
}