public class Solution {
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        int right=n-1;
        for(int left=0; left<n/2; left++) {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            right--;
        }

        return nums;
    }
}