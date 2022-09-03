class Solution {
    //TC - O(N^2)
    //SC - O(N^2)
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size()==1) return triangle.get(0).get(0);

        int[][] dp = new int[triangle.size()][triangle.size()];
        for(int[] r: dp)
            Arrays.fill(r, -1);
        return recur(triangle, 0, 0, dp);
    }
    
    private int recur(List<List<Integer>> triangle, int r, int c, int[][] dp){

        if(r==triangle.size()-1)
            return triangle.get(r).get(c);
        if(dp[r][c]!=-1) return dp[r][c];
        return dp[r][c] = triangle.get(r).get(c) + 
            Math.min(recur(triangle, r+1, c, dp), 
                     recur(triangle, r+1, c+1, dp));
    }
}
