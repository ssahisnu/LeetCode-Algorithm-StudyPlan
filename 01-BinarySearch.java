class Solution {
    public int search(int[] nums, int target) {
     
        int l=0;
        int h=nums.length-1;
        
        while(l<=h) {
            int mid = l+(h-l)/2; //Prevent overflows
            if(nums[mid]<target) {
                l = mid+1;
            } else if(nums[mid]>target) {
                h = mid-1;
            } else {
                return mid;
            }
        }
        
        return -1;
        
    }
}
