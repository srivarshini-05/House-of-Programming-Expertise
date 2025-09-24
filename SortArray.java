import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int arr[]= new int[a];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
        }
        if(min<0){
            min=min*-1;
        }
        else{
            min=0;
        }
        int frq[]=new int[max+1+min];
        for (int i=0;i<a;i++){
            frq[arr[i]+min]++;
        }
        while(true){
            int maxv=Integer.MIN_VALUE;
            int maxi=0;
            for(int i=0;i<frq.length;i++){
                if(maxv<frq[i]){
                    maxv=frq[i];
                    maxi=i;
                }
        }
        for(int i=0;i<maxv;i++){
            System.out.print(maxi-min+" ");
        }
        if(maxv==0){
            break;
        }
        else{
            frq[maxi]=0;
        }
    }
}}
