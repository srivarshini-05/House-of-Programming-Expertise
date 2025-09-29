class Solution {
    public int dfs(int i,int j,int grid[][],int r,int c,int dp[][]){
        if((i==r || j==c) || (grid[i][j]==1)){
            return 0;
        }
        if(i==r-1 && j==c-1){
            return 1;
        }
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        dp[i][j]=dfs(i,j+1,grid,r,c,dp)+dfs(i+1,j,grid,r,c,dp);
        return dp[i][j];
    }
    public int uniquePathsWithObstacles(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int dp[][]=new int[r][c];
        return dfs(0,0,grid,r,c,dp);
        }
    
    }
