import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
        // Write your code here.
		ArrayList<ArrayList<Long>> pascalTriangle = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Long> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1L);
                } else {
                    long value = pascalTriangle.get(i - 1).get(j - 1) + pascalTriangle.get(i - 1).get(j);
                    row.add(value);
                }
            }

            pascalTriangle.add(row);
        }

        return pascalTriangle;
	}
}
