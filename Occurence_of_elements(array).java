import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int arr[]= new int[a];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
            max=Math.max(max,arr[i]);
        }
        /*
        int m=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>m){
                m=arr[i];
            }
        }*/
        int frq[]=new int[max+1];
        for (int i=0;i<a;i++){
            frq[arr[i]]++;
        }for(int i=0;i<frq.length;i++){
            if(frq[i]!=0){
                System.out.print(frq[i]+" ");
            }
        }
    }
}
