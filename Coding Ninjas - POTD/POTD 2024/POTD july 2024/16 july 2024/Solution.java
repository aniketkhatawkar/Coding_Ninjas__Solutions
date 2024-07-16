public class Solution {
    public static int kSmallest(int n, int m, int k, int[][] mat) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for (int j = 0; j < m; j++) {
            minHeap.add(mat[0][j]);
        }
        
        for (int i = 1; i < n; i++) {
            PriorityQueue<Integer> tempHeap = new PriorityQueue<>();
            while (!minHeap.isEmpty()) {
                int val = minHeap.poll();
                for (int j = 0; j < m; j++) {
                    tempHeap.add(val + mat[i][j]);
                }
            }
            while (tempHeap.size() > k) {
                tempHeap.poll();
            }
            minHeap = tempHeap;
        }
        
        return minHeap.peek();
    }
}