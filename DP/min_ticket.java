import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s1[] = sc.nextLine().split(" ");
        HashSet<Integer> set = new HashSet<>();
        int day;
        for(int i=0;i<s1.length;i++)
        {
            day= Integer.parseInt(s1[i]);
            set.add(day);
        }
        
        int cost[] = new int[3];
        for(int p=0;p<3;p++)
        {
            cost[p] = sc.nextInt();
        }
        
        int n = s1.length;
        int target = Integer.parseInt(s1[(s1.length)-1]);
        int dp[] = new int[target+1];
        int u=0,v=0,w=0;
       
        for(int i=1;i<dp.length;i++){
            if(set.contains(i)){
                if(i-1<0){
                    u=cost[0];
                }
                else{
                    u=dp[i-1]+cost[0];
                }
                if(i-7<0){
                    v=cost[1];
                }
                else{
                    v=dp[i-7]+cost[1];
                }
                if(i-30<0){
                    w=cost[2];
                }
                else{
                    w=dp[i-30]+cost[2];
                }
                 dp[i]=Math.min(w,Math.min(u,v));
            }
            else{
                dp[i]=dp[i-1];
            }
           
            
        }
      
        System.out.println(dp[target]);
    }
}
