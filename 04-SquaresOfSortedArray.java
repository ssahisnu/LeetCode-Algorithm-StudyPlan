class Solution {
   
    //TC - O(N)
    //SC - O(1)
    public int[] sortedSquares(int[] nums) {
        
        int j=0, k=nums.length-1;
        int[] res = new int[nums.length];
        
        for(int i = nums.length-1 ; i>=0; --i) {
            if(Math.abs(nums[j]) > Math.abs(nums[k])) {
                res[i] = nums[j]*nums[j];
                j++;
            }
            else {
                res[i] = nums[k]*nums[k];
                k--;
            }
        }
        return res;
    }
}
