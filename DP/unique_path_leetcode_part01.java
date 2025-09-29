class Solution {
    int fun(int r,int c,int n,int m,int dp[][]){
        if(r==n || c==m){
            return 0;
        }
        if(r==n-1 && c==m-1){
            return 1;
        }
        if(dp[r][c]!=0){
            return dp[r][c];
        }
        dp[r][c]=fun(r,c+1,n,m,dp)+fun(r+1,c,n,m,dp);
        return dp[r][c];

    }
    public int uniquePaths(int n, int m) {
       int dp[][]=new int[n][m];
       return  fun(0,0,n,m,dp);
       
        
    }
}
