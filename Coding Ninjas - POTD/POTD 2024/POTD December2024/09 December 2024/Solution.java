public class Solution {
    public static int totalSteps(int n, int k, int[] flowers) {
        // Write your code here.
        int ans=0;
        int tank=k;
        for(int i=0; i<n; i++){
            if(tank>=flowers[i]){
                ans++;
                tank-=flowers[i];
            }
            else {
                ans+=i;
                tank=k;
                tank-=flowers[i];
                ans+=i+1;
            }
        }

        return ans;
    }
}