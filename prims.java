import java.io.*;
import java.util.*;

public class Solution {
    public static void prims(int a[][],int v){
        boolean[] vis=new boolean[v];
        vis[0]=true;
        for(int i=0;i<v-1;i++){
            int x=0;
            int y=0;
            int min=Integer.MAX_VALUE;
            for(int sv=0;sv<v;sv++){
                if(vis[sv]){
                    for(int ev=0;ev<v;ev++){
                        if(a[sv][ev]!=0 && vis[ev]==false){
                            if(a[sv][ev]<min){
                                min=a[sv][ev];
                                x=sv;
                                y=ev;
                            }
                        }
                    }
                }
            }
            System.out.println(x+" "+y+" "+min);
            vis[y]=true;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        int[][] a=new int[v][v];
        for(int i=0;i<e;i++){
            int sv=sc.nextInt();
            int ev=sc.nextInt();
            int w=sc.nextInt();
            a[sv][ev]=w;
            a[ev][sv]=w;
        }
        prims(a,v);
    }
}




//NOTES
/* min no. of edge=v-1
no. of spanning tree=v(v-1)/2
starting vertex=always vistied 
*/
