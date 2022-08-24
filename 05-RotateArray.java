class Solution {
    
    //BCR - {O(3N), O(1)}
    public void rotate(int[] nums, int k) {
        
        k = k % nums.length; //Important
        if(k==0) return;
        
        //reverse first half
        int l = 0; int h = nums.length-1-k;
        reverse(nums, l, h);
        
        //reverse second half
        l = nums.length-k;
        h = nums.length-1;
        reverse(nums, l, h);
        
        //reverse total arr
        l = 0;
        h = nums.length-1;
        reverse(nums, l, h);
        
        return;
    }
    
    private void reverse(int[] arr, int st, int end) {
        while(st<end){
            int tmp = arr[st];
            arr[st++] = arr[end];
            arr[end--] = tmp;
        }
    }
}
