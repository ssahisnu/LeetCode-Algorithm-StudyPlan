public class Solution {
    //TC - O(32)
    //SC- O(1)
    public int hammingWeight(int n) {
        int iter=31;
        int sum = 0;
        while(n!=0){
            int cur = (1 << iter);
            boolean isBitSet = (n & cur)!=0? true:false;
            if(isBitSet) sum++;
            n = n&(cur-1);
            iter--;
        }
        return sum;
    }
}
