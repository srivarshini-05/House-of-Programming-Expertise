import java.io.*;
import java.util.*;

public class Solution {

    public static void hourGlass(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<=m-3;i++){
            for(int j=0;j<=n-3;j++){
                int s=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                maxSum=Math.max(maxSum,s);
            }
        }
        System.out.print(maxSum);
    }
}
