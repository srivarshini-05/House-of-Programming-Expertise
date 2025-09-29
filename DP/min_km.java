import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int mat[][] = new int[r][c];
        int dp[][] = new int[r][c];
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // base case
        dp[0][0] = mat[0][0];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0 && j == 0) continue; 

                int u = (i > 0) ? dp[i-1][j] : Integer.MAX_VALUE;
                int v = (j > 0) ? dp[i][j-1] : Integer.MAX_VALUE;
                int w = (i > 0 && j > 0) ? dp[i-1][j-1] : Integer.MAX_VALUE;

                dp[i][j] = mat[i][j] + Math.min(w, Math.min(u, v));
            }
        }

        System.out.println(dp[r-1][c-1]);
    }
}
