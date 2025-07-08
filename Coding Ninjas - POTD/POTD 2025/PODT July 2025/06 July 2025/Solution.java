public class Solution {
    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        int count=1;

        for(int i=0; i<n-1; i++){
            if(arr[i]!=arr[i+1]){
                count++;
            }
        }

        return count;
    }
}