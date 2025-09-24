import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int y=0;
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int s=0;
        int s1=0;
        for(int u=0;u<n;u++){
            s+=arr[u][0];
        }
        for(int c=0;c<n;c++){
            s1=0;
            for(int r=0;r<n;r++){
                s1+=arr[c][r];
            }
                if(s1!=s){
                    y=1;
                    break;
                }
                else{
                    continue;
                }
        }
         for(int rr=0;rr<n;rr++){
            s1=0;
            for(int cc=0;cc<n;cc++){
                s1+=arr[cc][rr];
            }
                if(s1!=s){
                    y=1;
                    break;
                }
                else{
                    continue;
                }
        }
        s1=0;
        int s2=0;
        for(int d=0;d<n;d++){
            s1+=arr[d][d];
            s2+=arr[d][n-d-1];
        }
        if(s1!=s || s2!=s){
                    y=1;
                }
         
        if(y==1){
            System.out.print("no");
        }
        else{
            System.out.println("yes");
        }
    }
}
