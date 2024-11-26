import java.util.*;
public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.

        Arrays.sort(a);

        int ans[] = new int[2];
        ans[1]=a[1];
        ans[0]=a[n-2];

        return ans;
    }
}