import java.util.*;
public class Solution {
    public static List<Integer> MinimumCoins(int n) {
        // Write your code here.
        int coins[] = {1000, 500, 100, 50, 20, 10, 5, 2, 1};
        List<Integer> ans = new ArrayList<>();

        while(n>0){
            for(int i=0; i<9; i++){
                if(n>=coins[i]){
                    n-=coins[i];
                    ans.add(coins[i]);
                    break;
                }
            }
        }

        return ans;
    }
}
