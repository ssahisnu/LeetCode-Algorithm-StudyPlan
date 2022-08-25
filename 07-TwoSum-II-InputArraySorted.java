class Solution {
    //numbers -> sorted, exactly one solution
    //BCR - {O(N), O(1), 2ptr}
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=numbers.length-1;
        int[] res = new int[2];
        
        while(l<r) {
            int sum = (numbers[l]+numbers[r]);
            if(sum==target){
                res[0] = l+1;
                res[1] = r+1;
                break;
            } else if(target<sum) {
                //reduce
                r--;
            } else {
                //increase
                l++;
            }
        }
        return res;
    }
}
