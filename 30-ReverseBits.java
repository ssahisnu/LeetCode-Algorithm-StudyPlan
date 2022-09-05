public class Solution {
    // you need treat n as an unsigned value
    //TC - O(32)
    //SC - O(1)
    public int reverseBits(int n) {
        int res = 0;
        for(int i=31; i>=0; --i){
            boolean isBitSet = (n & (1<<i))!=0;
            if(isBitSet){
                res |= (1 << (31-i));
            }
        }
        
        return res;
    }
}
