import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int min(int dis[],boolean vis[],int v){
        int m_v= Integer.MAX_VALUE;
        int m_i=0;
        for(int i=0;i<v;i++){
            if(dis[i]<m_v && !vis[i]){
                m_v=dis[i];
                    m_i=i;
            }
        }
        return m_i;
    }
    public static void dij(int g[][],int v){
        int dis[]=new int[v];
        boolean vis[]=new boolean[v];
        for(int i=0;i<v;i++){
            dis[i]=Integer.MAX_VALUE;
        }
        dis[0]=0;
        for(int i=0;i<v-1;i++){
            int sv=min(dis,vis,v);
            for(int ev=0;ev<v;ev++){
                if(g[sv][ev]!=0 && !vis[ev] && dis[sv]+g[sv][ev]<dis[ev]){
                    dis[ev]=dis[sv]+g[sv][ev];
                }
            }
            vis[i]=true;
        }
        for(int i=0;i<v;i++){
            System.out.println(i+" "+dis[i]);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        int g[][]=new int[v][v];
        for(int i=0;i<e;i++){
            int sv=sc.nextInt();
            int ev=sc.nextInt();
            int w=sc.nextInt();
            g[sv][ev]=w;
            g[ev][sv]=w;
        }
        dij(g,v);
        
    }
}
