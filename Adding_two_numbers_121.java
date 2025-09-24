import java.io.*;
import java.util.*;

public class Solution {
    static void func(int a[],int b[],int n,int m)
    {
        int i = n-1;
        int j = m-1;
        int c = 0;
        while(i>=0 && j>=0)
        {
            int sum = a[i]+b[j]+c;
            c = (sum)/10;
            a[i] = (sum) % 10;
            i--;
            j--;
        }
        
        while(i>=0)
        {
            int sum = a[i]+c;
            c = (sum)/10;
            a[i] = (sum) % 10;
            i--;
        }
        
        if(c>0)
        {
            int res[] = new int[n+1];
            res[0] = c;
            for(int r=0;r<n;r++)
            {
                res[r+1] = a[r];
            }
            for(int k=0; k<res.length;k++)
            {
                System.out.print(res[k]+" ");
            } 
            return;
        }
        else
        {
            for(int k=0; k<a.length;k++)
            {
                System.out.print(a[k]+" ");
            } 
        }
        
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        for(int i=0;i<n1;i++)
        {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        for(int i=0;i<n2;i++)
        {
            arr2[i] = sc.nextInt();
        }
        
        if(n1>n2)
        {
            func(arr1,arr2,n1,n2);
        }
        else
        {
            func(arr2,arr1,n2,n1);
        }
        
    } 
}
