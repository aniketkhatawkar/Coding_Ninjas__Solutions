public class Solution {
    public static int totalSteps(int n, int k, int[] flowers) {
        // Write your code here.
        int curr=0, count=0, tank=k;

        for(int i=0; i<n; i++){
            if(tank>=flowers[i]){
                count++;
                tank-=flowers[i];
            }
            else if(tank<k){
                count+=i;
                tank=k;
                tank-=flowers[i];
                count+=i+1;
            }
        }

        return count;
    }
}