// "static void main" must be defined in a public class.
//DP-->MEMOIZATION AND TABULATION METHOD
import java.util.*;
public class Main {
    //MEMOIZATION
    public static int fib(int n,int dp[]){
        if(n<=1){
            return dp[n];
        }
        if(dp[n]!=0)
            return dp[n];
        dp[n]=fib(n-1,dp)+fib(n-2,dp);
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int dp[]=new int[n+1];
        //TABULATION
        /*arr[0]=0;
        arr[1]=1;
        for(int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }*/
        dp[0]=0;
        dp[1]=1;
        fib(n,dp);
        for(int i=0;i<n;i++){
            System.out.print(dp[i]+" ");
        }
        
    }
}
