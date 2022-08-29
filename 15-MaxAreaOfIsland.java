class Solution {
    //TC - O(row*col)
    //SC - O(1)/O(row*col) //input is not modifiable
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for(int i=0; i<grid.length; ++i){
            for(int j=0; j<grid[0].length; ++j){
                if(grid[i][j]==1)
                    maxArea = Math.max(maxArea, findArea(grid, i, j));
            }
        }
        return maxArea;
    }
    int[] dx = new int[]{-1,1,0,0};
    int[] dy = new int[]{0,0,-1,1};
    private int findArea(int[][] g, int r, int c){
        if(r<0 || r>=g.length || c<0 || c>=g[0].length || g[r][c]!=1)
            return 0;
        g[r][c] = 0;
        int val = 1;
        for(int i=0; i<4; ++i){
            val += findArea(g, r+dx[i], c+dy[i]);
        }
        
        return val;
    }
}
