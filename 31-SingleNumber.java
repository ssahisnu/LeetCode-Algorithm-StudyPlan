class Solution {
    //TC - O(N)
    //SC - O(1)
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int v : nums) {
            res ^=v;
        }
        return res;
    }
}
