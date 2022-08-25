class Solution {
    //TC - O(N)
    //SC - O(1)
    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;
        for(int i=0; i<nums.length; ++i){
            if(nums[i]!=0) {
                nums[lastNonZeroFoundAt++] = nums[i];
            }
        }
        for(int i=lastNonZeroFoundAt; i<nums.length; ++i){
            nums[i] = 0;
        }
    }
}
