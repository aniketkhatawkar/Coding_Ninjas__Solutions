import java.util.*;

public class Solution {
    public static boolean isValid(String str) {
        int n = str.length();
        boolean[][] dp = new boolean[n][n];
        
        for (int i = 0; i < n; i++) {
            dp[i][i] = false;
        }
        
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                
                if (isMatchingPair(str.charAt(i), str.charAt(j))) {
                    dp[i][j] = (len == 2) || dp[i + 1][j - 1];
                }
                
                for (int k = i; k < j; k++) {
                    if (dp[i][k] && dp[k + 1][j]) {
                        dp[i][j] = true;
                        break;
                    }
                }
            }
        }
        
        return dp[0][n - 1];
    }
    
    private static boolean isMatchingPair(char open, char close) {
        if (open == 'X' && close == 'X') return true;
        if (open == 'X') return (close == ')' || close == '}' || close == ']');
        if (close == 'X') return (open == '(' || open == '{' || open == '[');
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
}
