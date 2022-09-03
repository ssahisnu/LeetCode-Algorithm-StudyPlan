class Solution {
    //TC - O(N)
    //SC - O(N)
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return recur(nums, 0, dp);
    }
    
    private int recur(int[] nums, int ind, int[] dp){
        if(ind>=nums.length)
            return 0;
        if(dp[ind]!=-1) return dp[ind];
        //take
        int take = nums[ind] + recur(nums, ind+2, dp);
        //not-take
        int notTake = recur(nums, ind+1, dp);
        return dp[ind]=Math.max(take, notTake);
    }
}
